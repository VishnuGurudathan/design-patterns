package org.vishnu.client;

import org.vishnu.gift.Gift;
import org.vishnu.gift.GiftSurpriseBox;

/**
 * @author vishnu.g
 * @project org.vishnu.client : composite-pattern
 * @created 06/Jun/2020
 */
public class ClientGiftDemo {

    public static void main(String[] args) {
        Gift giftCar = new Gift("Toy Car");
        Gift giftBarbieDoll = new Gift("Barbie doll");

        GiftSurpriseBox giftBox = new GiftSurpriseBox();
        GiftSurpriseBox subGiftBox = new GiftSurpriseBox();

        giftBox.add(giftCar);
        subGiftBox.add(giftBarbieDoll);

        giftBox.add(subGiftBox);
        
        giftBox.unWrap();
    }

}
