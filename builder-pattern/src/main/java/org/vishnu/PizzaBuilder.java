package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : builder-pattern
 * @created 16/May/2020
 */
/* Abstract Builder */
public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    void assignPrice();
    void createNewPizzaProduct();
    Pizza getPizza();
}
