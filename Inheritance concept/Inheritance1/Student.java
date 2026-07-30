package Inheritance1;

public class Student extends Person {
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course){
        super(name,age);
        this.rollNo = rollNo;
        this.course = course;   
    }
    void display(){
        System.out.println("name    : " + name);
        System.out.println("age     : " + age);
        System.out.println("roll no : " + rollNo);
        System.out.println("course  : " + course);
    }   
}
