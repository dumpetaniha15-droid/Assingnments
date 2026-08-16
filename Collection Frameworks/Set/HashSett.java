package Set;
import java.util.HashSet;
import java.util.List;

public class HashSett {
    public static void main(String[] args) {
        
        HashSet<String> Fruits = new HashSet<>();
        Fruits.add("Apple");
        Fruits.add("Grapes");
        Fruits.add("Kv");
        Fruits.remove("Grapes"); //removes grapes
        Fruits.add("Kv");  // Ignored-duplication

        System.out.println(Fruits); //[Appple,Kv]
        System.out.println(Fruits.size()); //2
        System.out.println(Fruits.contains("Kv"));//true
       
        //set operations
        HashSet<String> setA = new HashSet<>(List.of("Apple", "Kv"));
        HashSet<String> setB = new HashSet<>(List.of("Apple", "Banana", "Mango"));
        System.out.println(setA); //Apple,kv
        System.out.println(setB); //Apple,Mango, Banana


        //Union - all fruits from both sets
        HashSet<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union); //Apple, Mango, Kv, Banana
    }
}
//HashSet not follows insertion order(randomly selected) and dont allows duplicates