package Maps;
import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args){
        HashMap<String,String> student= new HashMap<>();

        student.put("Niha","Dumpeta");
        student.put("Shinchan","Himawari");
        student.put("Motu","Patlu");
        student.put("inspector","singam");
        student.put("dumpeta","Niharika");//Duplication

        System.out.println(student);
        System.out.println("Keys:" + student.keySet());
        System.out.println("Values:" + student.values());
        System.out.println("contains the keys:" + student.containsKey("Niha"));
        System.out.println("contains the value:" + student.containsValue("Patlu"));
        System.out.println(student.remove("Motu"));
        System.out.println(student);

        System.out.println(student.getOrDefault("madhu","not Found"));
        System.out.println(student.getOrDefault("dumpeta","not Found"));
    }
}
