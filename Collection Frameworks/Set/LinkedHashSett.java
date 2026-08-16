package Set;
import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[] args) {
        
        LinkedHashSet<String> Library= new LinkedHashSet<>();
        Library.add("Book 1");
        Library.add("Book 2");
        Library.add("Book 3");
        Library.add("Book 1");  // IGNORED 

        System.out.println(Library);  //[Book 1, Book 2, Book]
        System.out.println(Library.size()); //3
        System.out.println(Library.contains("Book 3"));  //true
    }
}
// LinkedHashSet follows insertion order and dont allow duplicates 