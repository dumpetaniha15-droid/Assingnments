package list;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {
    public static void main(String[] args){

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add(0,"Tomato");
        vegetables.add(1,"Potato");
        vegetables.add(2,"Brinjal");
        vegetables.add(3,"Onion");
        vegetables.add(0,"Bettroot");
        vegetables.add(4,"Carrot");

        System.out.println("vegetables: " + vegetables);
        System.out.println(vegetables.get(0));
        System.out.println(vegetables.get(1));
        System.out.println(vegetables.get(2));
        System.out.println(vegetables.get(3));
        System.out.println(vegetables.get(0));
        System.out.println(vegetables.get(4));
        System.out.println(vegetables);   // print all vegetables 
        System.out.println(vegetables.contains("Onion"));  //true
        System.out.println(vegetables.isEmpty());    //false
        System.out.println("Size: " + vegetables.size());  //6
    
        Collections.sort(vegetables);
        System.out.println(vegetables);  // print all vegetables
        vegetables.clear();
        System.out.println(vegetables);  // clear all vegetables-[]
        System.out.println(vegetables.isEmpty());  //true bcz we cleared 
    }
}

    
