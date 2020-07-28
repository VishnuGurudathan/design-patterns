package org.vishnu.gift;

/**
 * @author vishnu.g
 * @project org.vishnu.gift : composite-pattern
 * @created 06/Jun/2020
 */
/** Leaf class **/
public class Gift implements SurpriseBox {

    private String giftName;

    public Gift(String name) {
        this.giftName = name;
    }
    @Override
    public void unWrap() {
        System.out.println("The gift is un wrapped [Gift : " + this.giftName + "]");
    }
}
