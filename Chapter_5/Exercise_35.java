package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 10/17/2017.

 (Summation) Write a program to compute the following summation.
    1                1                         1                            1
 -------------  + ----------------- +  ------------------ + .... + ------------------------
   1 + sqrt(2)    sqrt(2) + sqrt(3)     sqrt(3) + sqrt(4)           sqrt(624) + sqrt(625)


 */
public class Exercise_35 {
    public static void main(String[] args) {
        double total = 0;

        for(int i = 3; i < 626; i++){
            total += ((1) / ((Math.sqrt(i - 1)) + (Math.sqrt(i))));
        }

        total += ((1) / (1 + (Math.sqrt(2))));

        System.out.print("The result is " + total);
    }
}
