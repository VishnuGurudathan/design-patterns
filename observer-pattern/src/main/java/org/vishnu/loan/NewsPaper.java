package org.vishnu.loan;

import java.util.Observable;
import java.util.Observer;

/**
 * @author vishnu.g
 * @project org.vishnu.loan : observer-pattern
 * @created 25/May/2020
 */
public class NewsPaper implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("News Paper => Interest rate updated. New rate is : " + arg);
    }
}
