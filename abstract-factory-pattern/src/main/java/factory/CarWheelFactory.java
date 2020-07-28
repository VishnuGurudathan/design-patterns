package factory;

import products.CarExpert;
import products.SteelCarWheel;
import products.SuperCarExpert;
import products.AlloyCarWheel;
import products.Wheel;
import products.WheelFittingExpert;

/**
 * @author vishnu.g
 * @project factory : abstract-factory-pattern
 * @created 22/May/2020
 */
public class CarWheelFactory implements WheelFactory {
    @Override
    public WheelFittingExpert getWheelFittingExpert(ExpertType type) throws Exception {
        WheelFittingExpert wheelFittingExpert = null;
        switch (type) {
            case MANUAL:
                wheelFittingExpert = new CarExpert();
                break;
            case MACHINE:
                wheelFittingExpert = new SuperCarExpert();
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
                wheel = new SteelCarWheel();
                break;
            case ALLOY:
                wheel = new AlloyCarWheel();
                break;
            case CHROME_COATED:
                System.err.println("chrome coated car wheel yet to be defined.");
                break;
            default:
                throw new Exception("Wheel of type '" + wheelType + "' not supported.");
        }
        return wheel;
    }
}
