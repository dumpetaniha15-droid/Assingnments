public class mobileData {
    public static void main(String[] args){
          
        //parameter-less constructor:
        Mobile mob1 = new Mobile();
        mob1.brand = "Redmi 9A";
        mob1.ram = "2GB";
        mob1.storage = "32GB";

        mob1.intro();


        //parameterized constructor:
        Mobile mob2 = new Mobile("oppo","4GB","128GB");
        
        mob2.intro();
    }
}
