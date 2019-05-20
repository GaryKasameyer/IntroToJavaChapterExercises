package Chapter10_Exercises;

import Independent.Course;

/**
 * Created by Gary Kasameyer on 4/11/2018.

 (The Course class) Revise the Course class as follows:

 ■ The array size is fixed in Listing 10.6. Improve it to automatically increase
 the array size by creating a new larger array and copying the contents of the
 current array to it.
 ■ Implement the dropStudent method.
 ■ Add a new method named clear() that removes all students from the
 course.

 Write a test program that creates a course, adds three students, removes one,
 and displays the students in the course.

 */
public class Exercise_09 {
    public static void main(String[] args) {
        Course course = new Course("Math");

        course.addStudent("Jimmy");
        course.addStudent("Billy");
        course.addStudent("John");

        course.dropStudent("John");

        String[] students = course.getStudents();
        for(int i = 0; i < students.length; i++){
            if(students[i] != null)
                System.out.print(students[i] + ", ");
        }
    }
}
