package Independent;

/**
 * Created by Gary Kasameyer on 4/14/2018.

 (The Queue class) Section 10.6 gives a class for Stack. Design a class named
 Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
 elements are retrieved in a last-in first-out fashion. In a queue, the elements are
 retrieved in a first-in first-out fashion. The class contains:

 ■ An int[] data field named elements that stores the int values in the
 queue.
 ■ A data field named size that stores the number of elements in the queue.
 ■ A constructor that creates a Queue object with default capacity 8.
 ■ The method enqueue(int v) that adds v into the queue.
 ■ The method dequeue() that removes and returns the element from the
 queue.
 ■ The method empty() that returns true if the queue is empty.
 ■ The method getSize() that returns the size of the queue.

 Draw an UML diagram for the class. Implement the class with the initial array
 size set to 8. The array size will be doubled once the number of the elements
 exceeds the size. After an element is removed from the beginning of the array,
 you need to shift all elements in the array one position the left. Write a test
 program that adds 20 numbers from 1 to 20 into the queue and removes these
 numbers and displays them.

 UML:
        Queue
 +elements: int[]
 +size: int
 -------------------------
 +Queue()
 +enqueue(v: int)
 +dequeue(): int
 +empty(): boolean
 +getSize(): int
 +increaseArray(elements: int[])
 +remove()

 */
public class Queue {
    int[] elements;
    int size;

    public Queue(){
        elements = new int[8];
        size = 8;
    }

    public void enqueue(int v){
        if(elements[elements.length - 1] != 0) {
            elements = increaseArray(elements);
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                elements[i] = v;
                size++;
                break;
            }
        }
    }

    public int dequeue(){
        int temp = elements[0];
        remove();
        return temp;
    }

    public boolean empty(){
        for(int i = 0; i < elements.length; i++){
            if(elements[i] != 0 && size != 1){
                return false;
            }
        }
        return true;
    }

    public int getSize(){
        return size;
    }

    /** Use remove to remove an element from the array then move all following elements to the left */
    public void remove(){
        int len = getSize();
        size--;
        for(int i = 0; i <= len; i++){
            elements[i] = elements[i+1];
        }
    }

    /** Use increaseArray to create a new array double the size of the original array, copy old array contents into it then, return the array */
    public int[] increaseArray(int[] elements){
        int[] temp = new int[elements.length * 2];

        for(int row = 0; row < elements.length; row++){
            temp[row] = elements[row];
        }
        return temp;
    }

    public int[] returnElements(){
        return elements;
    }
}
