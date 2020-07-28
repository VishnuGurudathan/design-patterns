package factory;

import products.Wheel;
import products.WheelFittingExpert;

/**
 * @author vishnu.g
 * @project factory : abstract-factory-pattern
 * @created 22/May/2020
 */
public interface WheelFactory {
    /**
     *<p>
     *    Find  {@link WheelFittingExpert} class based on {@link ExpertType}
     *</p>
     * @param type
     * @return {@link WheelFittingExpert}
     * @throws Exception
     */
    WheelFittingExpert getWheelFittingExpert(ExpertType type) throws Exception;

    /**
     * <p>
     *     Find {@link Wheel} class based on {@link WheelType}
     * </p>
     * @param wheelType
     * @return {@link Wheel}
     * @throws Exception
     */
    Wheel getWheel(WheelType wheelType) throws Exception;
}
