package flitesharp.unitOfMeasure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class represents a unit of measure which can be associated with a type. A unit of measure can represent a
 * non-dimensional quantity, a primitive unit (a unit which does not have a corresponding formula) or a formula of
 * primitive units of measure.
 */
public class UnitOfMeasure {
    private final Map<String, Integer> formula;

    /**
     * Constructs a new unit of measure representing a non-dimensional quantity.
     */
    public UnitOfMeasure() {
        formula = new HashMap<>();
    }

    /**
     * Constructs a new unit of measure representing a formula of primitive units of measure.
     * @param formula a maps containing the primitive units of the formula, each associated with its exponent
     */
    public UnitOfMeasure(Map<String, Integer> formula) {
        this.formula = new HashMap<>(formula);
        for(String u: this.formula.keySet()) {
            if(this.formula.get(u) == 0)
                this.formula.remove(u);
        }
    }

    /**
     * Constructs a new unit of measure which is a copy of a given unit of measure.
     * @param toCopy the unit of measure to copy
     */
    public UnitOfMeasure(UnitOfMeasure toCopy) {
        this.formula = new HashMap<>(toCopy.formula);
        for(String u: this.formula.keySet()) {
            if(this.formula.get(u) == 0)
                this.formula.remove(u);
        }
    }

    /**
     * Multiplies this unit of measure with the given unit of measure. The product of two units of measure is a formula
     * containing all the units of measure appearing in the formulas of the operands. Each unit in the product formula
     * has an associated exponent equal to the sum of the exponents of the unit in the operands formulas (if it doesn't
     * appear in one of the operand formula the exponent is considered equal to 0). Units of measure with exponent 0 in
     * the resulting formula are removed.
     * @param multiplier the unit of measure to multiply
     * @return a unit of measure representing the product of this unit of measure with the given unit
     */
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

    /**
     * Divides this unit of measure by the given unit of measure. The division of two units of measure is a formula
     * containing all the units of measure appearing in the formulas of the operands. Each unit in the resulting formula
     * has an associated exponent equal to the subtraction of the exponents of the unit in the operands formulas (if it
     * doesn't appear in one of the operand formula the exponent is considered equal to 0). Units of measure with
     * exponent 0 in the resulting formula are removed.
     * @param divisor the unit of measure representing the divisor
     * @return a unit of measure representing the division of this unit of measure by the given unit
     */
    public UnitOfMeasure divide(UnitOfMeasure divisor) {
        return multiply(divisor.computeExponential(-1));
    }

    /**
     * Returns the exponentiation of the unit of measure by the given exponent. The exponentiation of a unit of measure
     * is a formula containing all the units of measure appearing in the original formula. Each unit in the resulting
     * formula has an associated exponent equal to the multiplication of its original exponent with the given exponent.
     * Units of measure with exponent 0 in the resulting formula are removed.
     * @param exponent the exponent of the exponentiation
     * @return the exponentiation of the unit of measure by the given exponent
     */
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

    /**
     * Checks if two units of measure are identical. Two units of measure are identical if represented by the same
     * formula.
     * @param toCompare the unit of measure to compare to
     * @return true if the units of measure are identical; false otherwise
     */
    public boolean match(UnitOfMeasure toCompare) {
        if(this.formula.size() != toCompare.formula.size())
            return false;
        for(String u: this.formula.keySet()) {
            if(!Objects.equals(this.formula.get(u), toCompare.formula.get(u)))
                return false;
        }
        return true;
    }

    /**
     * Checks if the unit of measures represents a non-dimensional quantity.
     * @return true if the unit of measures represents a non-dimensional quantity; false otherwise
     */
    public boolean isEmpty() {
        return formula.isEmpty();
    }

    /**
     * Returns a string representation of the unit of measure.
     * @return a string representation of the unit of measure
     */
    public String getStringRepresentation() {
        if(formula.isEmpty())
            return "<1>";
        StringBuilder s = new StringBuilder("<");
        for(String u: formula.keySet().stream().sorted().toList()) {
            s.append(u);
            if(formula.get(u) != 1)
                s.append("^").append(formula.get(u));
            s.append(" ");
        }
        return s.toString().trim() + ">";
    }
}
