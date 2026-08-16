package Queue;
import java.util.ArrayDeque;

public class DequeSTRING {
    public static void main(String[] args) {
        
        ArrayDeque<String> Fruit = new ArrayDeque<>();

        Fruit.addFirst("Apple");
        Fruit.addLast("Mango");
        Fruit.addFirst("KV");  
        Fruit.addLast("Grapes");

        System.out.println(Fruit);
        System.out.println(Fruit.peekFirst());     
        System.out.println(Fruit.peekLast());
        System.out.println(Fruit.poll());
        System.out.println("After poll: "+ Fruit); 

        System.out.println(Fruit.removeFirst());
        System.out.println(Fruit.removeLast());
    }
}

