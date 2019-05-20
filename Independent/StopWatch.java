package Independent;

/**
 * Created by Gary Kasameyer on 5/6/2017.

 (Stopwatch) Design a class named StopWatch. The class contains:

 ■ Private data fields startTime and endTime with getter methods.
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time.
 ■ A method named stop() that sets the endTime to the current time.
 ■ A method named getElapsedTime() that returns the elapsed time for the
 stopwatch in milliseconds.

 Draw the UML diagram for the class and then implement the class. Write a test
 program that measures the execution time of sorting 100,000 numbers using
 selection sort.

 UML:
        StopWatch
 -startTime: double
 -endTime: double
 ---------------------------
 +StopWatch()
 +getStartTime(): double
 +getEndTime(): double
 +start(): void
 +stop(): void
 +getElapsedTime(): double


 */
public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
