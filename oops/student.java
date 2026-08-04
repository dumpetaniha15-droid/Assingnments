package oops;

//parent class:
abstract class person{
    private String name;
    private int rollNo;

    person(String name, int rollNo) {   //Parameterized Constructor
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName() {  //getters(encapsulation)
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    abstract void display();   //abstract method
}

// Child Class: (inheritance)
class ClgStudent extends person{
    private int marks;

    ClgStudent(String name, int rollNumber, int marks) {   //Parameterized Constructor
        super(name, rollNumber);
        this.marks = marks;
    }
//polymorphism: override
    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Marks: " + marks);
    }
}

    

