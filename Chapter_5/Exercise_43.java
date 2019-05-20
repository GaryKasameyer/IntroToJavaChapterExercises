package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 10/22/2017.

 (Math: combinations) Write a program that displays all possible combinations
 for picking two numbers from integers 1 to 7. Also display the total number of
 all combinations.

 1 2
 1 3
 ...
 ...
 The total number of all combinations is 21

 */
public class Exercise_43 {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 7; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
