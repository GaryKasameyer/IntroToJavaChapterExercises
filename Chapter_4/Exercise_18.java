package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Student major and status) Write a program that prompts the user to enter two
 characters and displays the major and status represented in the characters. The first
 character indicates the major and the second is number character 1, 2, 3, 4, which
 indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 the following chracters are used to denote the majors:

 M: Mathematics
 C: Computer Science
 I: Information Technology

 Here is a sample run:

 Enter two characters: M1
 Mathematics Freshman

 Enter two characters: C3
 Computer Science Junior

 Enter two characters: T3
 Invalid input

 */
public class Exercise_18 {
    public static void main(String[] args) {
        char major;
        int rank;
        String user, userNumber, userMajor = "", userRank = "";

        // Prompt user for variable
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        user = input.next();
        // Convert user input to uppercase to allow lowercase major entries
        user = user.toUpperCase();
        major = user.charAt(0);
        // Obtain substring for int
        userNumber = user.substring(1, 2);
        // Convert substring to int
        rank = Integer.parseInt(userNumber);
        // Guess I could have used 48 - 51 to represent
        // the ranks 1 - 4 after conversion from String to char


        switch ((int)major){
            case (int)'M':{
                userMajor = "Mathematics";
                break;
            }
            case (int)'C':{
                userMajor = "Computer Science";
                break;
            }
            case (int)'I':{
                userMajor = "Information Technology";
                break;
            }
        }

        switch (rank){
            case 1:{
                userRank = "Freshman";
                break;
            }
            case 2:{
                userRank = "Sophomore";
                break;
            }
            case 3:{
                userRank = "Junior";
                break;
            }
            case 4:{
                userRank = "Senior";
                break;
            }
        }

        System.out.print(userMajor + " " + userRank);
    }
}
