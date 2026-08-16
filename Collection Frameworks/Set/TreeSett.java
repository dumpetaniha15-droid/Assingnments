package Set;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {

        TreeSet<Integer> Marks = new TreeSet<>();

        Marks.add(95);
        Marks.add(80);
        Marks.add(70);
        Marks.add(95);   //Ignoed ->Duplicates not allows

        System.out.println("Sorted order: " + Marks); // [70,80,95]-sorted order
        System.out.println(Marks.first()); //70
        System.out.println(Marks.last()); //95

        //headSet -means Below value
        System.out.println(Marks.headSet(95)); //[70,80]
        //TailSet -Entered value and Above value
        System.out.println(Marks.tailSet(70));//[70,80,95]
    }
}
//Tree set stores values in a sorted order 
//not follows insertion order and duplicates also