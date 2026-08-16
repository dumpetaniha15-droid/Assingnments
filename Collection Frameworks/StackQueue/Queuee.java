package StackQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Queuee {
    public static void main(String[] args) {
        Queue<String> name= new LinkedList<>();
 
        name.offer("Madhu");
        name.offer("priya");
        name.add("Niha");
        name.offer("Uma");
 
        System.out.println(name);
        System.out.println("Remove:" + name.poll());//it removes first element
        System.out.println("First elemet: " + name.peek());//view the first element
        System.out.println(name.isEmpty());
        System.out.println("size:" + name.size());
        System.out.println(name);
    }
}