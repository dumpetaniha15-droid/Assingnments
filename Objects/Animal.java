package Objects;
//Constructor Overloading
public class Animal {
    String name;
    int age;

    Animal(String name, int age){  //parameterized 
        this.name = name;
        this.age = age;
    }
    Animal(){        //parameterless

    }
    void intro(){
        System.out.println("my name is " + name + " and iam " + age + " years old");
    }
    void display(){
        System.out.println(name + " says boww boww...!");
        System.out.println(name + " is eating");
        System.out.println(name + " is playing");
        System.out.println(name + " is sleeping zzzZZZZ");
    }

    public static void main(String[] args) {
        Animal A1 = new Animal("Lucky", 2);
        A1.intro();
        A1.display();

        Animal A2 = new Animal();
        A2.name = "Snoopy";
        A2.age = 3;
        A2.intro();
        A2.display();
        }
    }

    // supporse that in a class there are more than one constructor then that is called "constructor overloading"

    


