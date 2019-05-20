package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 10/15/2017.

 (Perfect number) A positive integer is called a perfect number if it is equal to
 the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
 + 1. There are four perfect numbers less than 10,000. Write a program to find all
 these four numbers.

 // loop through the numbers 1 - 10,000
 // in that loop
 // start another loop to go through number from 1, to the first loop value
 // check if those numbers are a divisor, if so add to the tempValue
 // when inner loop == outer loop, check if tempValue sum == outer loop
 // if i == 6
 // then j should == 3 && 2 && 1;
 // if tempValue of inner == outer, print the number otherwise rest value and move one

 */
public class Exercise_33 {
    public static void main(String[] args) {
        int tempValue = 0;
        for(int i = 1; i < 10000; i++){
            for(int j = 1; j <= i; j++){
                if(j == i && tempValue == i){
                    System.out.printf("%1d\n", tempValue);
                }
                else if(i % j == 0){
                    tempValue += j;
                }
            }
            tempValue = 0;
        }
    }
}
