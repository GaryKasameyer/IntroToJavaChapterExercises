package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/30/2017.

 (Compute e) You can approximate e using the following series:

 e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!

 Write a program that displays the e value for i = 10000, 20000, …, and
 100000. (Hint: Because i! = i * (i - 1) * ... * 2 * 1, then

 1 / i! is 1 / i(i - 1)!

 Initialize e and item to be 1 and keep adding a new item to e. The new item is
 the previous item divided by i for i = 2, 3, 4, . . . .)

 */
public class Exercise_26 {
    public static void main(String[] args) {
        // define e and item
        double e = 1.0, item = 1.0;

        // use loop to go through 100000
        for(double i = 1.0; i <= 100000; i++){
            // find factorial denominator
            for(double j = i; j > 1;){
                item *= j;
                if(j > 1)
                    --j;
            }

            // perform calculation with factorial denominator
            e += 1.0 / item;

            // Reset item = 1.0
            item = 1.0;

            // Check whether to display e value
            if(i % 10000 == 0)
                System.out.printf("e at %1.0f is %1.20f\n", i, e);
        }
    }
}
