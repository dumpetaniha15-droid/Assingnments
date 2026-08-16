package Queue;
import java.util.PriorityQueue;

public class priorityQueueSTRING {
    public static void main(String[] args) {

        PriorityQueue<String> subjects = new PriorityQueue<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");

        System.out.println("priority Queue: " + subjects);
        System.out.println("Size: " + subjects.size());
        System.out.println(subjects.peek());
        System.out.println(subjects.poll());
        System.out.println("After poll: " + subjects);

    } // priority is based on alphabetic order 
}
    



