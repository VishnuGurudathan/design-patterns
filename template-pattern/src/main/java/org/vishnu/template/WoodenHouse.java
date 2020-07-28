package org.vishnu.template;

/**
 * @author vishnu.g
 * @project org.vishnu.template : template-pattern
 * @created 24/May/2020
 */
public class WoodenHouse extends HouseBuildingTemplate {
    protected void buildFoundation() {
        System.out.println("Build foundation for wooden house.");
    }

    protected void constructRoof() {
        System.out.println("Build roof for wooden house.");
    }

    protected void constructWalls() {
        System.out.println("Build walls for wooden house.");
    }

    protected void constructWindows() {
        System.out.println("Construct windows for wooden house.");
    }

    protected void constructDoors() {
        System.out.println("Construct doors for wooden house.");
    }
}
