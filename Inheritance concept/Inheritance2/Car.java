package Inheritance2;

public class Car extends Vehicle{
    String model;
    String fuelType;

 Car(String brand, String colour, String model, String fuelType){
    super(brand,colour);
    this.model = model;
    this.fuelType = fuelType;
 }
 void display(){
    System.out.println("brand    : " + brand);
    System.out.println("colour   : " + colour);
    System.out.println("model    : " + model);
    System.out.println("fuelType : " + fuelType);
 }
}
