package StackQueue;
import java.util.Stack;

public class Stackk {
  public static void main(String[] args) {
        Stack<String> name= new Stack<>();  
 
        name.push("Hima");
        name.push("Niha");
        name.push("Rajesh");
        name.push("kanna");
 
        System.out.println("Student names:" + name);
        System.out.println("Remove:" + name.pop());//Remove fisrt top element
        System.out.println(name);
        System.out.println("Top element:" + name.peek());//view top elemenet without removing it
        System.out.println(name);
 
        System.out.println(name.search("Niha"));
        System.out.println(name.isEmpty());
        System.out.println("size:" + name.size());
        System.out.println(name);
    }
}
 
    

