package Chapter8_Exercises;

/**
 * Created by Gary Kasameyer on 5/11/17.

 (Compute the weekly hours for each employee) Suppose the weekly hours for all
 employees are stored in a two-dimensional array. Each row records an employ-
 ee’s seven-day work hours with seven columns. For example, the following
 array stores the work hours for eight employees. Write a program that displays
 employees and their total hours in decreasing order of the total hours.

            Su M T W Th F Sa
 Employee 0 2 4 3 4 5 8 8
 Employee 1 7 3 4 3 3 4 4
 Employee 2 3 3 4 3 3 2 2
 Employee 3 9 3 4 7 3 4 1
 Employee 4 3 5 4 3 6 3 8
 Employee 5 3 4 4 6 3 4 4
 Employee 6 3 7 4 8 3 8 4
 Employee 7 6 3 5 9 2 7 9

2,4,3,4,5,8,8
7,3,4,3,3,4,4
3,3,4,3,3,2,2
9,3,4,7,3,4,1
3,5,4,3,6,3,8
3,4,4,6,3,4,4
3,7,4,8,3,8,4
6,3,5,9,2,7,9

 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[][] sorted = new int[8][2], computed = new int[8][2];
        int[][] hours = {{2,4,3,4,5,8,8}, {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2}, {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8}, {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4}, {6,3,5,9,2,7,9}};

        //cycle through hours and total them
        //at the end of each totaling, populate computed with the values
        for(int i = 0; i <  hours.length; i++){
            int total = 0;
            for(int j = 0; j < hours[i].length; j++){
                total += hours[i][j];
            }
            computed[i][0] = i;
            computed[i][1] = total;
        }


        //sort through computed and add to sorted array
        //by calling getLowest to initialize LowestIndex, then transfer
        // computed[lowestIndex][0] (employee number) && computed[lowestIndex][1] (total hours)
        //to the sorted array, after transferring, replace computed[lowestIndex[1] == 0;
        for(int i = 0; i < computed.length; i++){
            int highestIndex = getHighest(computed);
            sorted[i][0] = computed[highestIndex][0];
            sorted[i][1] = computed[highestIndex][1];
            computed[highestIndex][1] = 0;
        }


        //print out the array
        for(int i = 0; i < computed.length; i++) {
            System.out.println("Employee " + sorted[i][0] + "'s total hours is: " + sorted[i][1]);
        }

    }

    /** Use highest = 0 and compare to each entry
    //if entry is > highest, highest = entry
    //repeat for entire array. */
    public static int getHighest(int[][] computed){
        int highestIndex = 0;
        int highest = 0;

        for(int i = 0; i < computed.length; i++){
            if(computed[i][1] > highest && computed[i][1] != 0){
                highest = computed[i][1];
                highestIndex = i;
            }
        }
        return highestIndex;
    }
}
