package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/8/2017.

 (Assign grades) Write a program that reads student scores, gets the best score,
 and then assigns grades based on the following scheme:

 Grade is A if score is >= best - 10
 Grade is B if score is >= best - 20;
 Grade is C if score is >= best - 30;
 Grade is D if score is >= best - 40;
 Grade is F otherwise.

 The program prompts the user to enter the total number of students, then prompts
 the user to enter all of the scores, and concludes by displaying the grades. Here
 is a sample run:

 Enter the number of students: 4
 Enter 4 scores: 40 55 70 58
 Student 0 score is 40 and grade is C
 Student 1 score is 55 and grade is B
 Student 2 score is 70 and grade is A
 Student 3 score is 58 and grade is B

 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentScores;

        // Initialize the studentScores[] with numberOfStudents
        studentScores = new int[getNumberOfStudents()];

        // Prompt user for that number of student scores
        System.out.print("Enter " + studentScores.length + " scores: ");
        for(int i = 0; i < studentScores.length; i++){
            studentScores[i] = input.nextInt();
        }

        // Call getBestGrade to get bestGrade
        int bestGrade = getBestGrade(studentScores);

        // Use getGrade to find char grade for all studentScores and print them out
        for(int i = 0; i < studentScores.length; i++){
            System.out.printf("Student %1d score is %1d and grade is %1s\n", i, studentScores[i], getGradeChar(studentScores[i], bestGrade));
        }
    }

    /** Use getNumberOfStudents to prompt user for total students */
    public static int getNumberOfStudents(){
        // Prompt user for number of student grades
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        return input.nextInt();
    }

    /** Use getBestGrade to find the best grade in the studentScore[] */
    public static int getBestGrade(int[] studentScores){
        int bestGrade = studentScores[0];

        for(int i = 1; i < studentScores.length; i++){
            if(studentScores[i] > bestGrade)
                bestGrade = studentScores[i];
        }

        return bestGrade;
    }

    /** Use getGradeChar to use the student's score compared against the best grade, to get the student's grade character */
    public static char getGradeChar(int studentScore, int bestGrade){
        char[] scores = {'A', 'B', 'C', 'D', 'F'};

        if(studentScore >= bestGrade - 10)
            return scores[0];
        else if(studentScore >= bestGrade - 20)
            return scores[1];
        else if(studentScore >= bestGrade - 30)
            return scores[2];
        else if(studentScore >= bestGrade - 40)
            return scores[3];
        else
            return scores[4];
    }
}
