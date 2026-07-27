package Encapsulation;

public class details {
     public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("Niharika");
        s1.setrollNo(07);
        s1.setMarks(94);

        System.out.println("name: " + s1.getName());      
        System.out.println("rollNo: " + s1.getRollNo());
        System.out.println("marks: " + s1.getMarks());

        if(s1.getMarks()>=35){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
    
