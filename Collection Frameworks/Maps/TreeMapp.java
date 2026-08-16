package Maps;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap<String,Integer> SI= new TreeMap<>();

        SI.put("Zebra",1);
        SI.put("Apple",  2);
        SI.put("Mango",  3); 
        SI.put("Banana", 4); 

        System.out.println(SI);
        System.out.println("keys:" + SI.keySet());
        System.out.println("values:" + SI.values());
        System.out.println("size:" + SI.size());
        System.out.println(SI.firstKey()); //APPle
        System.out.println(SI.lastKey());  //Zebra

        System.out.println(SI.headMap("Mango"));
        System.out.println(SI.tailMap("Banana"));

        System.out.println(SI.floorKey("Cat")); //gretest key <=geven key
        System.out.println(SI.ceilingKey("Dog")); //smallest key >= given key
        System.out.println(SI);










  
        
    }
    
}
