package Maps;
import java.util.LinkedHashMap;

public class LinkedHashMapp {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> num= new LinkedHashMap<>();
        
        num.put(1,"A");
        num.put(2,"B");
        num.put(3,"C");
        num.put(4,"D");

        System.out.println(num);
        System.out.println("keys:" + num.keySet());
        System.out.println("values:" + num.values());
        System.out.println("remove:" + num.remove(2));
        System.out.println("size:" + num.size());
        System.out.println("contains key:" + num.containsKey(1));
        System.out.println("contains value:" + num.containsValue("A"));
        System.out.println(num);
    }   
}
