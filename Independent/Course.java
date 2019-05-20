package Independent;

/**
 * Created by Gary Kasameyer on 4/12/2018.

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
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

     public Course(String courseName) {
     this.courseName = courseName;
     }

     public void addStudent(String student) {
         if(numberOfStudents == students.length)
             students = increaseArray(students);

         students[numberOfStudents] = student;
         numberOfStudents++;
     }

     public String[] getStudents() {
         return students;
     }

     public int getNumberOfStudents() {
         return numberOfStudents;
     }

     public String getCourseName() {
         return courseName;
     }

     public void dropStudent(String student) {
         for(int row = 0; row < students.length; row++){
             if(students[row].equals(student)){
                 students[row] = null;
                 break;
             }
         }
     }

     /** Clear students[] by creating a new array */
     public void clear(){
         students = new String[100];
     }

    /** Use increaseArray to create a new array double the size of the original array, copy old array contents into it then, return the array */
    public String[] increaseArray(String[] Students){
        String[] temp = new String[students.length * 2];

        for(int row = 0; row < temp.length; row++){
            temp[row] = students[row];
        }

        return temp;
    }
}
