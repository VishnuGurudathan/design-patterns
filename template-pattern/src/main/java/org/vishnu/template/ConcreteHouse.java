package org.vishnu.template;

/**
 * @author vishnu.g
 * @project org.vishnu.template : template-pattern
 * @created 24/May/2020
 */
public class ConcreteHouse extends HouseBuildingTemplate {
    protected void buildFoundation() {
        System.out.println("Build foundation for concrete house.");
    }

    protected void constructRoof() {
        System.out.println("Build concrete roof for concrete house.");
    }

    protected void constructWalls() {
        System.out.println("Construct walls for concrete house.");
    }

    protected void constructWindows() {
        System.out.println("Construct windows for concrete house.");
    }

    protected void constructDoors() {
        System.out.println("Construct doors for concrete house.");
    }
}
