package client;

import factory.*;
import products.Wheel;
import products.WheelFittingExpert;

/**
 * @author vishnu.g
 * @project client : abstract-factory-pattern
 * @created 22/May/2020
 */
public class AbstractFactoryPatternDemo {
    private WheelFactory factory;
    /**
     *<p>
     *     Constructor
     *</p>
     * @param factory
     */
    public AbstractFactoryPatternDemo (WheelFactory factory) {
        this.factory = factory;
    }
    public static void main(String[] args) throws Exception {

        AbstractFactoryPatternDemo demo = new AbstractFactoryPatternDemo(new CarWheelFactory());
        Wheel wheel = demo.getWheel(WheelType.ALLOY);
        WheelFittingExpert fittingExpert = demo.getWheelFittingExpert(ExpertType.MACHINE);

        System.out.println(wheel.getDescription());
        System.out.println(fittingExpert.getDescription());

        System.out.println("============================================================");

        WheelFactory wheelFactory = new BikeWheelFactory();
        Wheel bikeWheel = wheelFactory.getWheel(WheelType.STEEL);
        WheelFittingExpert bikeWheelFittingExpert = wheelFactory.getWheelFittingExpert(ExpertType.MANUAL);

        System.out.println(bikeWheel.getDescription());
        System.out.println(bikeWheelFittingExpert.getDescription());
    }

    private Wheel getWheel (WheelType wheelType) throws Exception
    {
        return factory.getWheel(wheelType);
    }

    private WheelFittingExpert getWheelFittingExpert (ExpertType expertType) throws Exception
    {
        return factory.getWheelFittingExpert(expertType);
    }
}
