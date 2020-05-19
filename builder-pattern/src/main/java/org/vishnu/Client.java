package org.vishnu;

/**
 * @author vishnu.g
 * @project PACKAGE_NAME : builder-pattern
 * @created 16/May/2020
 */
public class Client {
    public static void main(String[] args) {
        /* A customer ordering a pizza. */
        Waiter waiter = new Waiter();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza);
    }
}
