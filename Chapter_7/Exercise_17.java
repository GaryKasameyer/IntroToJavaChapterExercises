package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Sort students) Write a program that prompts the user to enter the number of students,
 the students’ names, and their scores, and prints student names in decreasing
 order of their scores.

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int numberOfStudents;
        String[] studentNames;
        int[] studentScores;

        // Prompt user to enter number of students
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Prompt user to enter student names
        studentNames = new String[numberOfStudents];
        studentScores = new int[numberOfStudents];

        for(int i = 0; i < studentNames.length; i++){
            System.out.print("Enter student " + (i + 1) + "s' name: ");
            studentNames[i] = input.next();
            System.out.print("Enter student " + (i + 1) + "s' score: ");
            studentScores[i] = input.nextInt();
        }

        for(int i = 0; i < numberOfStudents; i++){
            for(int j = 0; j < numberOfStudents; j++){
                if(studentScores[j] < studentScores[i]){
                    swap(studentScores, i, j);
                    swap(studentNames, i, j);
                }
            }
        }

        for(int i = 0; i < numberOfStudents; i++)
            System.out.println(studentNames[i] + " " + studentScores[i]);
    }

    /** Swap elements in int[] */
    public static int[] swap(int[] list, int i, int j){
        // Swap list[i] with list[j]
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;

        return list;
    }

    /** Swap elements in String[] */
    public static String[] swap(String[] list, int i, int j){
        // Swap list[i] with list[j]
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;

        return list;
    }
}
