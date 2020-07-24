package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 24/Jul/2020
 */
public class QuickSortStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("This is a sorting demo strategy, strategy is : " + this.getClass().getSimpleName());
    }
}
