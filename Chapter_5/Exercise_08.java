package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Find the highest score) Write a program that prompts the user to enter the number
 of students and each student’s name and score, and finally displays the name
 of the student with the highest score.

 */
public class Exercise_08 {
    public static void main(String[] args) {
        int numberOfStudents, score, scoreOfTopStudent = 0;
        String name, nameOfTopStudent = "";

        // Prompt user for number of students
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Use for loop set to numberOfStudents
        // to loop through student names and scores
        // to find the largest
        for(int i = 0; i < numberOfStudents; i++){
            System.out.print("Enter student's name: ");
            name = input.next();
            System.out.print("Enter the students score: ");
            score = input.nextInt();

            if(score > scoreOfTopStudent){
                nameOfTopStudent = name;
                scoreOfTopStudent = score;
            }
            System.out.println();
        }

        System.out.print("The student with the highest score is\nStudent Name: " + nameOfTopStudent + "\nStudent Score: " + scoreOfTopStudent);
    }
}
