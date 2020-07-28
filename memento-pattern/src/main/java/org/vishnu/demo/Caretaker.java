package org.vishnu.demo;

import java.util.ArrayList;

/**
 * <p>
 *
 *     The Caretaker knows not only “when” and “why” to capture the originator’s state,
 *     but also when the state should be restored.
 *     A caretaker can keep track of the originator’s history by storing a stack of mementos.
 *     When the originator has to travel back in history, the caretaker fetches the topmost memento
 *     from the stack and passes it to the originator’s restoration method.
 * <p/>
 *
 * @author : vishnu.g
 * created on : 28/Jul/2020
 */
public class Caretaker {

    private ArrayList<Memento> mementos;
    private int currentState = -1;

    public Caretaker() {
        this.mementos = new ArrayList<>();

    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
        currentState = this.mementos.size() - 1;
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public Memento getMemento() {
        return getMemento(currentState);
    }

    public Memento undo() {
        System.out.println("Undoing state...");
        Memento memento;
        if (currentState < 0) {
            memento = new Memento(null);
        } else if (currentState == 0) {
            currentState = 0;
            memento = getMemento();
        } else {
            currentState--;
            memento = getMemento();
        }
        return memento;
    }

    public Memento redo() {
        System.out.println("Redoing state...");
        Memento memento;
        if (currentState >= mementos.size() -1) {
            currentState = mementos.size() - 1;
            memento = getMemento(currentState);
        } else {
            currentState++;
            memento = getMemento();
        }
        return memento;
    }
}
