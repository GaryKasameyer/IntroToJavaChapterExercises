package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/17/2017.

 (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 closed on the first day of school. As the students enter, the first student, denoted
 S1, opens every locker. Then the second student, S2, begins with the second
 locker, denoted L2, and closes every other locker. Student S3 begins with the
 third locker and changes every third locker (closes it if it was open, and opens it if
 it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 Student S5 starts with L5 and changes every fifth locker, and so on, until student
 S100 changes L100.

 After all the students have passed through the building and changed the lockers,
 which lockers are open? Write a program to find your answer and display all
 open locker numbers separated by exactly one space.

 (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 locker is open (true) or closed (false). Initially, all lockers are closed.)

 */
public class Exercise_23 {
    public static void main(String[] args) {
        boolean[] lockerOpen = new boolean[101];

        // go through each student, each student goes through all lockers, and change the locker
        for(int student = 1; student < lockerOpen.length; student++){
            for(int locker = student; locker < lockerOpen.length; locker += student){
                lockerOpen[locker] = !lockerOpen[locker];
            }
        }

        // Print out the result
        for(int i = 1; i < lockerOpen.length; i++)
            System.out.printf("Locker %1d: %b\n", i, lockerOpen[i]);
    }
}
