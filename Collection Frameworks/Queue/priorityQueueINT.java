package Queue;
import java.util.PriorityQueue;
import java.util.List;

public class priorityQueueINT {
    public static void main(String[] args) {
 
        PriorityQueue<Integer> age = new PriorityQueue<>(List.of(30,15,25,19));

        System.out.println("Priority Queue: "+ age);
        System.out.println("Size: " + age.size());
        System.out.println(age.peek());
        System.out.println(age.poll());
        System.out.println("After poll: " + age);
       
        } //smallest number gets the highest priority in integer
    }
 

    

