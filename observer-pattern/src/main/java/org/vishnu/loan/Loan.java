package org.vishnu.loan;

import java.util.Observable;

/**
 * @author vishnu.g
 * @project org.vishnu.loan : observer-pattern
 * @created 25/May/2020
 */
public class Loan extends Observable {

    /** This class will extend the inbuilt Observable class of java **/

    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
        super();
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        setChanged();
        notifyObservers(getInterest());
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
