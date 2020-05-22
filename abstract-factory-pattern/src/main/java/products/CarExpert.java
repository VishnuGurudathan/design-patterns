package products;

/**
 * @author vishnu.g
 * @project products : abstract-factory-pattern
 * @created 22/May/2020
 */
public class CarExpert implements WheelFittingExpert {
    @Override
    public String getDescription() {
        return "I am a car wheel expert.";
    }
}
