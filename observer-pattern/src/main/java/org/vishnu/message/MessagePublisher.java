package org.vishnu.message;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public class MessagePublisher {

    private List<Observer> observers = new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    /* Observable/Subject  will notify the observers. */
    public void register(Observer o) {
        observers.add(o);
    }

    public void unregister(Observer o){
        observers.add(o);
    }

    public void notifyObservers(){
        observers.stream().forEach(o -> {
            o.update();
        });
    }
}
