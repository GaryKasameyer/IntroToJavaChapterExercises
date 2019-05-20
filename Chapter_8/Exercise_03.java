package Chapter8_Exercises;

/**
 * Created by Gary Kasameyer on 5/10/17.

 (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 students in increasing order of the number of correct answers.

 public class GradeExam {
  Main method
public static void main(String[] args) {
// Students' answers to the questions
        char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E',
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E',
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E',
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E',
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E',
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E',
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E',
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E',
        'A',
        'A',
        'A',
        'A',
        'A',
        'A',
        'A',
        'A',
        'D'},
        'D'},
        'D'},
        'D'},
        'D'},
        'D'},
        'D'},
        'D'}};
// Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
// Grade all answers
        for (int i = 0; i < answers.length; i++) {
// Grade one student
        int correctCount = 0;
        for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
        correctCount++;
        }
        System.out.println("Student " + i + "'s correct count is " +
        correctCount);
        }
        }
        }

 */
public class Exercise_03 {
    public static void main(String[] args) {
        int[][] students = new int[8][2];
        int[][] sorted = new int[8][2];
        int count = 7;


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        while(count > -1) {
            for (int i = 0; i < answers.length; i++) {
                int correctCount = 0;
                for (int j = 0; j < answers[i].length; j++) {
                    if (answers[i][j] == keys[j])
                        correctCount++;
                }

                students[i][1] = correctCount;
                students[i][0] = i;
            }

            for (int i = 0; i < students.length; i++) {
                int lowestIndex = findLowest(students);
                sorted[count][1] = students[lowestIndex][1];
                sorted[count][0] = students[lowestIndex][0];
                students[lowestIndex][1] = 0;
                if(count >= 0)
                    count--;
            }

            for (int i = 0; i < sorted.length; i++) {
                System.out.println("Student " + sorted[i][0] + "'s correct count is " + sorted[i][1]);
            }
        }

    }

    public static int findLowest(int[][] students){
        double highest = -1;
        int highestIndex = 0;
        for (int i = 0; i < students.length; i++){
            if(students[i][1] > highest && students[i][1] != 0){
                highest = students[i][1];
                highestIndex = i;
            }
        }
        return highestIndex;
    }
}
