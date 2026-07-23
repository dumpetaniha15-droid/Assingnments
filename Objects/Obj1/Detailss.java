    public class Detailss {
        public static void main(String[] args) {

        // parameter-less constructor:
        Student stu1 = new Student();
        stu1.name = "Niharika";
        stu1.age  = 19;

        stu1.study();
     

        //parameterized constructor:
        Student stu2 = new Student("Himawari",20);
        
        stu2.study();  
        }
    }