package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 2/14/2018.

 (Financial tsunami) Banks lend money to each other. In tough economic times,
 if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s
 total assets are its current balance plus its loans to other banks. The diagram in
 Figure 8.8 shows five banks. The banks’ current balances are 25, 125, 175, 75,
 and 181 million dollars, respectively. The directed edge from node 1 to node 2
 indicates that bank 1 lends 40 million dollars to bank 2.

 If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
 borrowed cannot be returned to the lender, and the lender cannot count the loan in
 its total assets. Consequently, the lender may also be unsafe, if its total assets are
 under the limit. Write a program to find all the unsafe banks. Your program reads
 the input as follows. It first reads two integers n and limit, where n indicates the
 number of banks and limit is the minimum total assets for keeping a bank safe. It
 then reads n lines that describe the information for n banks with IDs from 0 to n-1.
 The first number in the line is the bank’s balance, the second number indicates
 the number of banks that borrowed money from the bank, and the rest are pairs
 of two numbers. Each pair describes a borrower. The first number in the pair
 is the borrower’s ID and the second is the amount borrowed. For example, the
 input for the five banks in Figure 8.8 is as follows (note that the limit is 201):

 5 201
 25 2 1 100.5 4 320.5
 125 2 2 40 3 85
 175 2 0 125 3 75
 75 1 0 125
 181 1 2 125

 The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is
 unsafe. After bank 3 becomes unsafe, the total assets of bank 1 fall below
 (125 + 40). Thus, bank 1 is also unsafe. The output of the program should be

 Unsafe banks are 3 1

 (Hint: Use a two-dimensional array borrowers to represent loans.
 borrowers[i][j] indicates the loan that bank i loans to bank j. Once bank j
 becomes unsafe, borrowers[i][j] should be set to 0.)

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int numberOfBanks, totalAssetSafetyLimit;

        // Prompt user for numberOfBanks and totalAssetSafetyLimit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of banks and asset safety limit: ");
        numberOfBanks = input.nextInt();
        totalAssetSafetyLimit = input.nextInt();

        // Create two-dimensional array to hold borrowers
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];

        // Create one-dimensional array to hold bank balances
        double[] bankBalances = new double[numberOfBanks];

        // Populate the arrays with values from the user
        System.out.println("Enter the bank balance, number of loans, and bank getting loan with loan amount in pairs: ");
        for(int banks = 0; banks < 5; banks++){
            bankBalances[banks] = input.nextInt();

            for(int loans = input.nextInt(), zero = 0; zero < loans * 2; zero++){
                borrowers[banks][zero] = input.nextDouble();
            }
        }

        /** Print out bank balances
        for(int i = 0; i < bankBalances.length; i++){
            System.out.print(bankBalances[i] + " ");
        }

        System.out.println();

         Print out borrows to test
        for(int i = 0; i < borrowers.length; i++){
            for(int j = 0; j < borrowers[i].length; j++){
                System.out.print(borrowers[i][j] + " ");
            }
            System.out.println();
        }**/

        // loop through borrowers and add any loans to the bank balance
        // if final balance is > 201, its safe, else, its not
        for(int row = 0; row < borrowers.length; row++){
            for(int col = 0; col < borrowers[row].length;){
                // each bank is evan, use bankbalance[col] select the specified bank in bankBalances
                // then uses each odd to modify the value of bankBalances
                // then add 2 to get to the next bank
                // first check if we have reached the end of that row
                if(col == borrowers[row].length - 1)
                    break;

                int tempbank = (int)borrowers[row][col++];
                double tempamount = borrowers[row][col++];

                bankBalances[tempbank] += tempamount;
                //col += 2;
            }
        }

        // Print out all bankBalances that are <201
        System.out.print("Unsafe banks are ");
        for(int banks = 0; banks < bankBalances.length; banks++)
            if(bankBalances[banks] < 201)
                System.out.print(banks + " ");


        for(int i = 0; i < bankBalances.length; i++)
            System.out.print(bankBalances[i]);
    }
}
