package org.vishnu.client;

import org.vishnu.calculation.*;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        // Define all of the objects in the chain

        Chain chainAdd = new AddNumbers();
        Chain chainSub = new SubtractNumbers();
        Chain chainDiv = new DivideNumbers();


        // Define each object where to forward the
        // data if it couldn't process the request

        chainAdd.setNextChain(chainSub);
        chainSub.setNextChain(chainDiv);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        Numbers request = new Numbers(4d,2d, CalculationType.DIVIDE);

        chainAdd.handle(request);
    }
}
