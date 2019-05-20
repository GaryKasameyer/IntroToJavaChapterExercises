package Chapter10_Exercises;
import java.util.Scanner;
import Independent.Account;

/**
 * Created by Gary Kasameyer on 8/9/2017.

 (Game: ATM machine) Use the Account class created in Programming Exercise
 9.7 to simulate an ATM machine. Create ten accounts in an array with id
 0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
 id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
 is accepted, the main menu is displayed as shown in the sample run. You can
 enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
 depositing money, and 4 for exiting the main menu. Once you exit, the system
 will prompt for an id again. Thus, once the system starts, it will not stop.

 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[10];
        int accountID, action;

        for(int i = 0; i < account.length; i++){
            account[i] = new Account();
            account[i].setBalance(100);
        }

        while(1 == 1){
            action = 0;
            System.out.print("\nEnter an Account ID: ");
            accountID = input.nextInt();

            while(action != 4){

                System.out.print("\nMain Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\nEnter a choice: ");
                action = input.nextInt();

                if (action == 1) {
                    System.out.println("The balance is " + account[accountID].getBalance());
                } else if (action == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    int amount = input.nextInt();
                    account[accountID].withdraw(amount);
                } else if (action == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    int amount = input.nextInt();
                    account[accountID].deposit(amount);
                }
            }
        }
    }
}
