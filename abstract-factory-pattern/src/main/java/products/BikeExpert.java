package products;

/**
 * @author vishnu.g
 * @project products : abstract-factory-pattern
 * @created 22/May/2020
 */
public class BikeExpert implements WheelFittingExpert {
    @Override
    public String getDescription() {
        return "I am a bike wheel expert.";
    }
}
