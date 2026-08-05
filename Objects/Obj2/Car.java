public class Car {

    String brand;
    String model;

    public Car(){

    }
  
Car(String brand, String model){
    this.brand = brand;
    this.model = model;
}  
void intro(){
    System.out.println("car brand: " + brand);
    System.out.println("car model: " + model);
}
}