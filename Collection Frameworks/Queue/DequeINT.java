package Queue;
import java.util.ArrayDeque;

public class DequeINT {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> marks = new ArrayDeque<>();

        marks.addFirst(80);
        marks.addFirst(70);
        marks.addLast(90);
        marks.addLast(100);

        System.out.println(marks);
        System.out.println(marks.peekFirst());     
        System.out.println(marks.peekLast());
        System.out.println(marks.poll());
        System.out.println("After poll: "+ marks); 

        marks.removeFirst();
        marks.removeLast();
    }
}

 
