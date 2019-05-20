package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/30/2017.

 (Compute p) You can approximate p by using the following series:
 PI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^i+1 / 2i - 1)

 Write a program that displays the PI value for i = 10000, 20000, …, and
 100000.

 */
public class Exercise_25 {
    public static void main(String[] args) {
        // Create PI variable
        double PI = 1.0;

        // Calculate the value of PI using the sequence
        for(int i = 2; i <= 100000; i++){
            PI += Math.pow(-1, i + 1) / ((2 * i) - 1);

            if(i % 10000 == 0)
                System.out.printf("Pi of %1d is %1.16f\n", i, 4 * PI);
        }
    }
}
