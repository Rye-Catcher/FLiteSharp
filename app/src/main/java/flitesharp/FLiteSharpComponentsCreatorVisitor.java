package flitesharp;

import flitesharp.component.compoundData.CompoundDataComponent;
import flitesharp.component.controlFlow.*;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.function.ApplicationComponent;
import flitesharp.component.function.FunDeclarationComponent;
import flitesharp.component.function.LambdaExprComponent;
import flitesharp.type.FLiteSharpTypesCreatorVisitor;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.unitOfMeasure.FLiteSharpUnitsOfMeasureCreatorVisitor;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;
import flitesharp.component.*;
import flitesharp.component.literal.*;
import flitesharp.component.operation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This visitor class explores the tree returned by the parser and constructs the corresponding tree of components. Each
 * node of the constructed tree is a Component representing an expression in the parsed program.
 */
public class FLiteSharpComponentsCreatorVisitor extends FLiteSharpBaseVisitor<Component> {
    private final FLiteSharpTypesCreatorVisitor typesCreatorVisitor;
    private final FLiteSharpUnitsOfMeasureCreatorVisitor unitsOfMeasureCreatorVisitor;

    /**
     * Constructs a new FLiteSharpComponentsCreatorVisitor.
     */
    public FLiteSharpComponentsCreatorVisitor() {
        super();
        typesCreatorVisitor = new FLiteSharpTypesCreatorVisitor();
        unitsOfMeasureCreatorVisitor = new FLiteSharpUnitsOfMeasureCreatorVisitor();
    }

    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing the top level code block of the program
     */
    @Override
    public Component visitStart(FLiteSharpParser.StartContext ctx) {
        ArrayList<Component> lineLst = new ArrayList<>();
        for (FLiteSharpParser.SequenceLineContext line : ctx.sequenceLine()) {
            lineLst.add(this.visit(line));
        }
        return new BlockComponent(lineLst);
    }

    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing a BLOCK of instructions
     */
    @Override
    public Component visitBlockExpression(FLiteSharpParser.BlockExpressionContext ctx) {
        return ctx.sequentialExpression().accept(this);
    }

    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing a BLOCK of instructions
     */
    @Override
    public Component visitSequentialExpression(FLiteSharpParser.SequentialExpressionContext ctx) {
        ArrayList<Component> lineLst = new ArrayList<>();
        for (FLiteSharpParser.SequenceLineContext line : ctx.sequenceLine()) {
            lineLst.add(this.visit(line));
        }
        lineLst.add(this.visit(ctx.expression()));
        Component component = new BlockComponent(lineLst);
        component.setFilePosition(lineLst.get(0).getLineNumber(), lineLst.get(0).getCharNumber());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a Component representing an expression in a block of code
     */
    @Override
    public Component visitSequenceLine(FLiteSharpParser.SequenceLineContext ctx) {
        if(ctx.bind() != null)
            return ctx.bind().accept(this);
        else
            return ctx.expression().accept(this);
    }

    /**
     * {@inheritDoc}
     *
     * @return a ParenthesesComponent representing a PARENTHESES EXPRESSION
     */
    @Override
    public Component visitParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx) {
        Component component = new ParenthesesComponent(ctx.inner.accept(this));
        component.setFilePositionFromTerminalNode(ctx.LEFTPAR());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a VarDeclarationComponent representing the binding of a value to a name
     */
    @Override
    public Component visitBind(FLiteSharpParser.BindContext ctx) {
        NameComponent nameComponent = new NameComponent(ctx.name.getText().trim());
        nameComponent.setType(ctx.type.accept(typesCreatorVisitor));
        Component component = new VarDeclarationComponent(nameComponent, ctx.expression().accept(this));
        component.setFilePositionFromTerminalNode(ctx.LET());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a LambdaExprComponent representing a LAMBDA EXPRESSION
     */
    @Override
    public Component visitLambdaFunction(FLiteSharpParser.LambdaFunctionContext ctx) {
        ArrayList<Component> paramsLst = new ArrayList<>();
        ctx.lambdaExpression().lambdaParameters().
                VARIABLE().forEach(
                        var -> paramsLst.add(new NameComponent(var.getText().trim())));
        for(int i=0; i<paramsLst.size(); i++) {
            TypeElement tmp = ctx.lambdaExpression().lambdaParameters().typeDeclaration().get(i)
                    .accept(typesCreatorVisitor);
            paramsLst.get(i).setType(tmp);
        }
        LambdaExprComponent tmp = new LambdaExprComponent(
                paramsLst,
                ctx.lambdaExpression().lambdaBody.accept(this));
        tmp.setFilePositionFromTerminalNode(ctx.lambdaExpression().LAMBDADEC());
        return tmp;
    }

    /**
     * {@inheritDoc}
     *
     * @return a FunDeclarationComponent representing a FUNCTION DECLARATION
     */
    @Override
    public Component visitFunctionDeclaration(FLiteSharpParser.FunctionDeclarationContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        NameComponent nameComponent = new NameComponent(ctx.funcDeclaration().functionName.getText().trim());
        ArrayList<Component> paramsLst = new ArrayList<>();
        ctx.funcDeclaration().params.
                VARIABLE().forEach(
                        var -> paramsLst.add(new NameComponent(var.getText().trim())));
        for(int i=0; i<paramsLst.size(); i++) {
            TypeElement paramType = ctx.funcDeclaration().params.typeDeclaration().get(i)
                    .accept(typesCreatorVisitor);
            paramsLst.get(i).setType(paramType);
            children.add(paramType);
        }
        children.add(ctx.funcDeclaration().typeDeclaration().accept(typesCreatorVisitor));
        nameComponent.setType(new TypeElement(TypeName.FUNC, children));
        FunDeclarationComponent tmp = new FunDeclarationComponent(
                nameComponent,
                paramsLst,
                ctx.funcDeclaration().functionBody.accept(this), false);
        tmp.setFilePositionFromTerminalNode(ctx.funcDeclaration().LET());
        return tmp;
    }

    /**
     * {@inheritDoc}
     *
     * @return a RecFunDeclarationComponent representing a RECURSIVE FUNCTION DECLARATION
     */
    @Override
    public Component visitRecFunctionDeclaration(FLiteSharpParser.RecFunctionDeclarationContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        NameComponent nameComponent = new NameComponent(ctx.recFuncDeclaration().functionName.getText().trim());
        ArrayList<Component> paramsLst = new ArrayList<>();
        ctx.recFuncDeclaration().params.
                VARIABLE().forEach(
                        var -> paramsLst.add(new NameComponent(var.getText().trim())));
        for(int i=0; i<paramsLst.size(); i++) {
            TypeElement paramType = ctx.recFuncDeclaration().params.typeDeclaration().get(i)
                    .accept(typesCreatorVisitor);
            paramsLst.get(i).setType(paramType);
            children.add(paramType);
        }
        children.add(ctx.recFuncDeclaration().typeDeclaration().accept(typesCreatorVisitor));
        nameComponent.setType(new TypeElement(TypeName.FUNC, children));
        FunDeclarationComponent tmp = new FunDeclarationComponent(
                nameComponent,
                paramsLst,
                ctx.recFuncDeclaration().functionBody.accept(this), true);
        tmp.setFilePositionFromTerminalNode(ctx.recFuncDeclaration().LET());
        return tmp;
    }

    /**
     * {@inheritDoc}
     *
     * @return an ApplicationComponent representing the call to a function
     */
    @Override
    public Component visitFuncApplication(FLiteSharpParser.FuncApplicationContext ctx) {
        ArrayList<Component> argumentLst = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.applyParameters().expression()) {
            argumentLst.add(this.visit(expr));
        }
        Component component = new ApplicationComponent(new NameComponent(ctx.name.getText().trim()), argumentLst);
        component.setFilePositionFromTerminalNode(ctx.VARIABLE());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NegativeComponent representing the NEGATIVE operation retrieved from ctx
     */
    @Override
    public Component visitNegative(FLiteSharpParser.NegativeContext ctx) {
        Component component = new NegativeComponent(ctx.expression().accept(this));
        component.setFilePositionFromTerminalNode(ctx.SUB());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a PowerComponent representing the POWER operation retrieved from ctx
     */
    @Override
    public Component visitPower(FLiteSharpParser.PowerContext ctx) {
        Component component = new PowerComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.POW());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a AdditionComponent representing the ADDITION operation retrieved from ctx
     */
    @Override
    public Component visitAdditionSubtraction(FLiteSharpParser.AdditionSubtractionContext ctx) {
        Component component;
        if(ctx.operator.getType() == FLiteSharpParser.ADD) {
            component = new AdditionComponent(ctx.left.accept(this), ctx.right.accept(this));
            component.setFilePositionFromTerminalNode(ctx.ADD());
        }
        else {
            component = new SubtractionComponent(ctx.left.accept(this), ctx.right.accept(this));
            component.setFilePositionFromTerminalNode(ctx.SUB());
        }
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a MultiplicationComponent representing the MULTIPLICATION operation retrieved from ctx
     */
    @Override
    public Component visitMultiplicationDivision(FLiteSharpParser.MultiplicationDivisionContext ctx) {
        Component component;
        if (ctx.operator.getType() == FLiteSharpParser.MUL) {
            component = new MultiplicationComponent(ctx.left.accept(this), ctx.right.accept(this));
            component.setFilePositionFromTerminalNode(ctx.MUL());
        }
        else {
            component = new DivisionComponent(ctx.left.accept(this), ctx.right.accept(this));
            component.setFilePositionFromTerminalNode(ctx.DIV());
        }
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a LessThanComponent representing the LESSTHAN operation retrieved from ctx
     */
    @Override
    public Component visitLessThan(FLiteSharpParser.LessThanContext ctx) {
        Component component = new LessThanComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.LESSTHAN());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a LessThanOrEqualComponent representing the LESSTHANOREQUAL operation retrieved from ctx
     */
    @Override
    public Component visitLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx) {
        Component component = new LessThanOrEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.LESSTHANOREQUAL());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a GreaterThanComponent representing the GREATERTHAN operation retrieved from ctx
     */
    @Override
    public Component visitGreaterThan(FLiteSharpParser.GreaterThanContext ctx) {
        Component component = new GreaterThanComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.GREATERTHAN());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return an EqualComponent representing the EQUAL operation retrieved from ctx
     */
    @Override
    public Component visitEqual(FLiteSharpParser.EqualContext ctx) {
        Component component = new EqualComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.EQUAL());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NotEqualComponent representing the NOTEQUAL operation retrieved from ctx
     */
    @Override
    public Component visitNotEqual(FLiteSharpParser.NotEqualContext ctx) {
        Component component = new NotEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.NOTEQUAL());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a GreaterThanOrEqualComponent representing the GREATERTHANOREQUAL operation retrieved from ctx
     */
    @Override
    public Component visitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx) {
        Component component = new GreaterThanOrEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.GREATERTHANOREQUAL());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return an AndComponent representing the AND operation retrieved from ctx
     */
    @Override
    public Component visitAnd(FLiteSharpParser.AndContext ctx) {
        Component component = new AndComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.AND());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return an OrComponent representing the OR operation retrieved from ctx
     */
    @Override
    public Component visitOr(FLiteSharpParser.OrContext ctx) {
        Component component = new OrComponent(ctx.left.accept(this), ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.OR());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NotComponent representing the NOT operation retrieved from ctx
     */
    @Override
    public Component visitNot(FLiteSharpParser.NotContext ctx) {
        Component component = new NotComponent(ctx.argument.accept(this));
        component.setFilePositionFromTerminalNode(ctx.NOT());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return an AttachComponent representing an ATTACH operation retrieved from ctx
     */
    @Override
    public Component visitAttach(FLiteSharpParser.AttachContext ctx) {
        Component component = new AttachComponent(ctx.left.accept(this),ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.ATTACH());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a ConcatenateComponent representing a CONCATENATE operation retrieved from ctx
     */
    @Override
    public Component visitConcatenate(FLiteSharpParser.ConcatenateContext ctx) {
        Component component = new ConcatenateComponent(ctx.left.accept(this),ctx.right.accept(this));
        component.setFilePositionFromTerminalNode(ctx.CONC());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NameComponent representing the name retrieved from ctx
     */
    @Override
    public Component visitVariable(FLiteSharpParser.VariableContext ctx) {
        Component component = new NameComponent(ctx.getText().trim());
        component.setFilePositionFromTerminalNode(ctx.VARIABLE());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a BooleanComponent representing the boolean literal retrieved from ctx
     */
    @Override
    public Component visitBoolean(FLiteSharpParser.BooleanContext ctx) {
        BooleanComponent component = new BooleanComponent(Boolean.parseBoolean(ctx.getText().trim()));
        component.setFilePositionFromTerminalNode(ctx.BOOLEAN());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NumberComponent representing the integer literal retrieved from ctx
     */
    @Override
    public Component visitInteger(FLiteSharpParser.IntegerContext ctx) {
        TypeElement type = new TypeElement(TypeName.INT);
        if(ctx.uom != null)
            type.setUnitOfMeasure(ctx.uom.accept(unitsOfMeasureCreatorVisitor));
        NumberComponent component = new NumberComponent(Double.parseDouble(ctx.INTEGER().getText().trim()), type);
        component.setFilePositionFromTerminalNode(ctx.INTEGER());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a NumberComponent representing the double literal retrieved from ctx
     */
    @Override
    public Component visitDouble(FLiteSharpParser.DoubleContext ctx) {
        TypeElement type = new TypeElement(TypeName.DOUBLE);
        if(ctx.uom != null)
            type.setUnitOfMeasure(ctx.uom.accept(unitsOfMeasureCreatorVisitor));
        NumberComponent component = new NumberComponent(Double.parseDouble(ctx.DOUBLE().getText().trim()), type);
        component.setFilePositionFromTerminalNode(ctx.DOUBLE());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a UnitComponent representing the unit literal retrieved from ctx
     */
    @Override
    public Component visitUnit(FLiteSharpParser.UnitContext ctx) {
        UnitComponent component = new UnitComponent();
        component.setFilePositionFromTerminalNode(ctx.UNIT());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a ConditionalExpressionComponent representing the conditional expression retrieved from ctx
     */
    @Override
    public Component visitConditionalExpr(FLiteSharpParser.ConditionalExprContext ctx) {
        Component component;
        if(ctx.alternate != null)
            component = new ConditionalExpressionComponent(ctx.test.accept(this), ctx.consequent.accept(this),
                    ctx.alternate.accept(this));
        else
            component = new ConditionalExpressionComponent(ctx.test.accept(this), ctx.consequent.accept(this));
        component.setFilePositionFromTerminalNode(ctx.IF());
        return component;
    }

    /**
     * {@inheritDoc}
     *
     * @return a CompoundDataComponent representing the list declaration retrieved from ctx
     */
    @Override
    public Component visitListExpression(FLiteSharpParser.ListExpressionContext ctx) {
        List <Component> elements = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.expression()) {
            elements.add(expr.accept(this));
        }
        Component tmp = new CompoundDataComponent(elements, true);
        tmp.setFilePositionFromTerminalNode(ctx.LEFTSQPAR());
        return tmp;
    }

    /**
     * {@inheritDoc}
     *
     * @return a CompoundDataComponent representing the tuple declaration retrieved from ctx
     */
    @Override
    public Component visitTupleExpression(FLiteSharpParser.TupleExpressionContext ctx) {
        List <Component> elements = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.expression()) {
            elements.add(expr.accept(this));
        }
        Component tmp = new CompoundDataComponent(elements, false);
        tmp.setFilePositionFromTerminalNode(ctx.LEFTPAR());
        return tmp;
    }

    @Override
    public Component visitUnitDeclaration(FLiteSharpParser.UnitDeclarationContext ctx) {
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        String name = ctx.name.getText().trim();
        if(ctx.formula == null)
            storage.addUnit(name);
        else
            storage.addUnit(name, ctx.formula.accept(unitsOfMeasureCreatorVisitor));
        Component component = new UnitComponent();
        component.setFilePositionFromTerminalNode(ctx.UNITOFMEASURE());
        return component;
    }
}
