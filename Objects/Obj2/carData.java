public class carData {

    public static void main(String[] args){

        //parameter-less condtuctor:
        Car car1 = new Car();
        car1.brand = "maruti";
        car1.model = "celerio";

        car1.intro();


        //parameterized constructor:
        Car car2 = new Car("maruti","baleno");

        car2.intro();
    }
}

