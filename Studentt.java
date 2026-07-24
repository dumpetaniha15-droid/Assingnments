public class Studentt {

    //private variables
    private String name;
    private int age;

    //Getters for name and age:
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setters for name and age:
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
//main method: - we can write mainMethod in same class or in another class also

    public static void main(String[] args){
        Studentt stu = new Studentt();      
        stu.setName("Niharika");      //setting values
        stu.setAge(19);

        System.out.println("student name: " + stu.getName());    //getting values
        System.out.println("student age: " + stu.getAge());
}
}
