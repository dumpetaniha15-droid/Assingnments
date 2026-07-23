public class Mobile {
    
    String brand;
    String ram;
    String storage;

    public Mobile(){

    }

Mobile(String brand, String ram, String storage){
    this.brand = brand;
    this.ram = ram;
    this.storage = storage;
}

void intro(){
    System.out.println("mobile brand: " + brand);
    System.out.println("mobile ram: " + ram);
    System.out.println("mobile storage: " + storage);
}
}


    
    

