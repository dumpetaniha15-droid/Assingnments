package list;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListt {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("HIma");
        names.add("Niha");
        names.add("prutvi");
        System.out.println(names);

        names.addFirst("kanna");
        names.addLast("Madhu");
        System.out.println("Afetr adding Names: " + names);
        System.out.println("size: " + names.size());  //5

        names.removeFirst();
        names.removeLast();
        System.out.println("After removing Names: " + names);
        System.out.println("size: " + names.size());  //3

        System.out.println(names.contains("Niha"));  //true

       
        System.out.println(names);
        System.out.println(names.peek()); //view head without removing it

        System.out.println(names);
        System.out.println(names.poll()); //returns head & remove head in the next step 
        System.out.println(names);  //in this head is removed->(HIma)


        Collections.sort(names);
        System.out.println(names);   
    }
}
