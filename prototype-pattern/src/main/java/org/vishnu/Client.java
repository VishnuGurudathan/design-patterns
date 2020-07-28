package org.vishnu;

import org.vishnu.prototype.ConcretePrototypeA;
import org.vishnu.prototype.PrototypeRegistry;

/**
 * @author vishnu.g
 * @project org.vishnu : prototype-pattern
 * @created 14/May/2020
 */
public class Client {
    public static void main(String[] args) {

        /*
         * Prototype using cloning is implemented here. One important thing to keep in mind is cloning is uses
         * shallow copy, if you want the application requires deep copy then have to implement based on that.
         *
         * The default version of clone() method creates the shallow copy of an object. The shallow copy of an object
         * will have exact copy of all the fields of original object. That means any changes made to those objects
         * through clone object will be reflected in original object or vice-versa.
         */
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA(2);

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototypeToRegistry(PrototypeRegistry.RegistryType.CONCRETE_PROTOTYPE_A, concretePrototypeA);

        ConcretePrototypeA clone = (ConcretePrototypeA) registry.getPrototypeCloneFromRegistry(PrototypeRegistry.RegistryType.CONCRETE_PROTOTYPE_A).clone();

        System.out.println("concretePrototypeA : " + concretePrototypeA);
        System.out.println("clone : " + clone);
    }
}
