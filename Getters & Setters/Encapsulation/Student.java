package Encapsulation;

public class Student {

    private String name;
    private int rollNo;
    private int marks;

    //getters for name, rollNo, marks:
    public String getName(){     
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getMarks(){
        return marks;
    }
    
    //setters for name, rollNo, marks:
    public void setName(String name){
        this.name = name;
    }
    public void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}
    

