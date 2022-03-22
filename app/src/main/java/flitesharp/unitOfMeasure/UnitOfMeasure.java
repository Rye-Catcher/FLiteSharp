package flitesharp.unitOfMeasure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UnitOfMeasure {
    private final Map<String, Integer> formula;

    public UnitOfMeasure() {
        formula = new HashMap<>();
    }

    public UnitOfMeasure(Map<String, Integer> formula) {
        this.formula = new HashMap<>(formula);
        for(String u: this.formula.keySet()) {
            if(this.formula.get(u) == 0)
                this.formula.remove(u);
        }
    }

    public UnitOfMeasure multiply(UnitOfMeasure multiplier) {
        UnitOfMeasure toReturn = new UnitOfMeasure(this.formula);
        for(String u: multiplier.formula.keySet()) {
            Integer uOldExponent = this.formula.get(u);
            Integer toAddExponent = multiplier.formula.get(u);
            if(uOldExponent == null) {
                toReturn.formula.put(u, toAddExponent);
            }
            else if(uOldExponent + toAddExponent == 0){
                toReturn.formula.remove(u);
            }
            else {
                toReturn.formula.put(u, uOldExponent + toAddExponent);
            }
        }
        return toReturn;
    }

    public UnitOfMeasure divide(UnitOfMeasure divisor) {
        return multiply(divisor.computeExponential(-1));
    }

    public UnitOfMeasure computeExponential(int exponent) {
        if(exponent == 0)
            return new UnitOfMeasure();
        UnitOfMeasure toReturn = new UnitOfMeasure(this.formula);
        for(String u: this.formula.keySet()) {
            Integer uOldExponent = this.formula.get(u);
            toReturn.formula.put(u, uOldExponent * exponent);
        }
        return toReturn;
    }

    public boolean match(UnitOfMeasure toCompare) {
        if(this.formula.size() != toCompare.formula.size())
            return false;
        for(String u: this.formula.keySet()) {
            if(!Objects.equals(this.formula.get(u), toCompare.formula.get(u)))
                return false;
        }
        return true;
    }

    public String getStringRepresentation() {
        if(formula.isEmpty())
            return "1";
        StringBuilder s = new StringBuilder();
        for(String u: formula.keySet().stream().sorted().toList()) {
            s.append(u);
            if(formula.get(u) != 1)
                s.append("^").append(formula.get(u));
            s.append(" ");
        }
        return s.toString().trim();
    }
}
