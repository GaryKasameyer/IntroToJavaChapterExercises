package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
 from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
 separated by exactly one space.

 */
public class Exercise_10 {
    public static void main(String[] args) {
        for(int i = 100, k = 0; i < 1001; i++){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                k++;
                if(k % 10 == 0)
                    System.out.println();
            }
        }
    }
}
