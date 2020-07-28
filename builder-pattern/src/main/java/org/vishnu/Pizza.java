package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : builder-pattern
 * @created 16/May/2020
 */
/* Product */
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;
    private double price;

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                ", price=" + price +
                '}';
    }
}
