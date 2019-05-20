package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Execution time) Write a program that randomly generates an array of 100,000
 integers and a key. Estimate the execution time of invoking the linearSearch
 method in Listing 7.6. Sort the array and estimate the execution time of invoking
 the binarySearch method in Listing 7.7. You can use the following code
 template to obtain the execution time:

 long startTime = System.currentTimeMillis();
 perform the task;
 long endTime = System.currentTimeMillis();
 long executionTime = endTime - startTime;

 The key is what to search for so,
 list = {1, 2, 3, 4, 5, 6}
 linearSearch(list, 5(key))
 should return index: 4
 because "5" is at index 4

 output in ms is giving 1's and 0's, this should be measured in nanoseconds not milliseconds
 you should replace
 System.currentTimeMillis();
 with
 System.nanoTime();
 to get results that measure accurately then convert the ns into ms

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int[] randomArray = createRandomArray(100000);
        int key = (int)(Math.random() * 1000);

        long startTime = System.currentTimeMillis();
        int index = linearSearch(randomArray, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        //System.out.print("The linear search execution time was " + executionTime + " ms");
        System.out.printf("The linear search execution time was %1d ms\nThe key %1d was located at index %1d\n", executionTime, key, index);

        randomArray = selectionSort(randomArray);

        startTime = System.currentTimeMillis();
        index = binarySearch(randomArray, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        //System.out.print("\nThe binary search execution time was " + executionTime + " ms");
        System.out.printf("\nThe binary search execution time was %1d ms\nThe key %1d was located at index %1d\n", executionTime, key, index);

    }

    /** Use createRandomArray to return a populated random array */
    public static int[] createRandomArray(int size){
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10000) + 1;
        }

        return array;
    }

    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }

        return -1;
    }

    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
            low = mid + 1;
        }

        return -low - 1; // Now high < low, key not found
    }

    /** Use Selection sort to sort nonRepeated in ascending order */
    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
