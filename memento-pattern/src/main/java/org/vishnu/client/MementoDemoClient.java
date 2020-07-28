package org.vishnu.client;

import org.vishnu.demo.Caretaker;
import org.vishnu.demo.Originator;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 28/Jul/2020
 */
public class MementoDemoClient {
    public static void main(String[] args) {
        /* Original data -> memory -> is stored to somewhere to retrieve.*/
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.restore(caretaker.undo());
        printState(originator);

        originator.setState("State 1");
        printState(originator);
        caretaker.addMemento(originator.save());

        originator.setState("State 2");
        caretaker.addMemento(originator.save());
        printState(originator);
        originator.setState("State 3");
        printState(originator);
        caretaker.addMemento(originator.save());
        originator.restore(caretaker.undo());
        printState(originator);
        originator.restore(caretaker.undo());
        printState(originator);
        originator.restore(caretaker.undo());
        printState(originator);
        originator.restore(caretaker.redo());
        printState(originator);

    }

    public static void printState(Originator originator) {
        System.out.println("Current State : " + originator.getState());
    }
}
