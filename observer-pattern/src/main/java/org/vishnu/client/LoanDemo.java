package org.vishnu.client;

import org.vishnu.loan.Internet;
import org.vishnu.loan.Loan;
import org.vishnu.loan.NewsPaper;

/**
 * @author vishnu.g
 * @project org.vishnu.client : observer-pattern
 * @created 25/May/2020
 */
public class LoanDemo {

    public static void main(String[] args) throws InterruptedException {
        /** This demo will use the Java's inbuilt Observer pattern. We will use extend the Observable class in the Loan
         * class to make it a observable/subject and implements Observer Interface in NewsPaper and Internet
         * to make them observers.
         * **/
        NewsPaper printMedia = new NewsPaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                "Standard Charterd");
        personalLoan.addObserver(printMedia);
        personalLoan.setInterest(3.5f);
        System.out.println("============================================================");

        personalLoan.addObserver(onlineMedia);
        Thread.sleep(1000);

        personalLoan.setInterest(7.5f);
        System.out.println("=============================================================");
    }
}
