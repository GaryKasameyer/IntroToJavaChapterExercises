package Chapter9_Exercises;

import Independent.StopWatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Gary Kasameyer on 5/6/2017.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Double> toSort = new ArrayList<>(100000);

        for(int i = 0; i < 100000; i++){
            toSort.add(Math.random() * toSort.size());
        }

        StopWatch timed = new StopWatch();

        timed.start();
        Collections.sort(toSort);
        timed.stop();

        System.out.println("Time required sort the array: " + timed.getElapsedTime() + " Milliseconds");
        System.out.println("Array sorted: " + toSort);
    }
}
