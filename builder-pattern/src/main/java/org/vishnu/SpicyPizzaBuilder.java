package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : builder-pattern
 * @created 16/May/2020
 */
/* ConcreteBuilder */
public class SpicyPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public void buildDough() {
        pizza.setDough("Pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni + salami");
    }

    public void assignPrice() {
        pizza.setPrice(180);
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }
}
