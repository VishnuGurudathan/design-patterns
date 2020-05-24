package org.vishnu.template;

/**
 * @author vishnu.g
 * @project org.vishnu.template : template-pattern
 * @created 24/May/2020
 */
public abstract class HouseBuildingTemplate {
    /**
     * abstract class HouseBuildingTemplate containing template method buildHouse and implementation
     * of steps which is same for all types of houses. Those implementations have
     * been marked as final. The step of algorithm is defined in the template method.
     */
    protected abstract void buildFoundation();
    protected abstract void constructRoof();
    protected abstract void constructWalls();
    protected abstract void constructWindows();
    protected abstract void constructDoors();

    /** Template method, should be final so subclasses can't override (this can be modified based on application need.) **/
    public final void buildHouse() {
        buildFoundation();
        constructWalls();
        constructWindows();
        constructDoors();
        constructRoof();
        paintHouse();
    }

    /** Consider painting is common for all type of house. **/
    private void paintHouse() {
        System.out.println("Painting house");
    }
}
