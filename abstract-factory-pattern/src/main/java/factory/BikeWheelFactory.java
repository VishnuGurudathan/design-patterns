package factory;

import products.BikeExpert;
import products.SteelBikeWheel;
import products.Wheel;
import products.WheelFittingExpert;

/**
 * @author vishnu.g
 * @project factory : abstract-factory-pattern
 * @created 22/May/2020
 */
public class BikeWheelFactory implements WheelFactory {
    @Override
    public WheelFittingExpert getWheelFittingExpert(ExpertType type) throws Exception {
        WheelFittingExpert wheelFittingExpert = null;
        switch (type) {
            case MANUAL:
                wheelFittingExpert = new BikeExpert();
                break;
            case MACHINE:
                System.err.println("Machine fitting expert is yet to be defined.");
                break;
            default:
                throw new Exception("Expert type, '" + type + "' not supported.");
        }
        return wheelFittingExpert;
    }

    @Override
    public Wheel getWheel(WheelType wheelType) throws Exception {
        Wheel wheel = null;
        switch (wheelType) {
            case STEEL:
                wheel = new SteelBikeWheel();
                break;
            case ALLOY:
                System.err.println("Alloy bike wheel fitting expert is yet to be defined.");
                break;
            case CHROME_COATED:
                System.err.println("Chrome coated bike wheel fitting yet to be defined.");
                break;
            default:
                throw new Exception("Wheel of type '" + wheelType + "' not supported.");
        }
        return wheel;
    }
}
