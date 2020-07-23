package org.vishnu.calculation;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class Numbers {

    private Double numberOne;
    private Double numberTwo;
    private CalculationType type;

    public Numbers(Double numberOne, Double numberTwo, CalculationType type) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.type = type;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public CalculationType getType() {
        return type;
    }

    public void setType(CalculationType type) {
        this.type = type;
    }
}
