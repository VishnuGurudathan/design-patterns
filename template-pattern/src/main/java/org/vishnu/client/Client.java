package org.vishnu.client;

import org.vishnu.template.ConcreteHouse;
import org.vishnu.template.HouseBuildingTemplate;
import org.vishnu.template.WoodenHouse;

/**
 * @author vishnu.g
 * @project org.vishnu.client : template-pattern
 * @created 24/May/2020
 */
public class Client {
    public static void main(String[] args) {
        HouseBuildingTemplate concreteHouse = new ConcreteHouse();
        concreteHouse.buildHouse();
        System.out.println("###########################################################");

        HouseBuildingTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
        System.out.println("###########################################################");
    }
}
