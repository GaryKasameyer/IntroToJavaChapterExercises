package Chapter9_Exercises;

import Independent.Account;

/**
 * Created by Gary Kasameyer on 5/6/2017.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Account x = new Account(1122, 20000);

        x.setAnnualInterestRate(4.5);
        x.withdraw(2500);
        x.deposit(3000);

        System.out.println("Balance: " + x.getBalance());
        System.out.println("Monthly Interest: " + x.getMonthlyInterest());
        System.out.println("Date Created: " + x.getDateCreated());
    }
}
