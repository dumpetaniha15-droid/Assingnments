public class stringss {
    public static void main(String[] args){
        String first = "dairy";
        String last = "milk";
        
        System.out.println("string1: "+ first);
        System.out.println("string2: "+ last);

        //firstly if we add any numbers then java directly add those numbers
        //but when we add them after a string then java concatenate them, for example:

        System.out.println(2+3+"niha:");          //5niha
        System.out.println(2+3+" niha:");         //5 niha (bcz we are given space)
        System.out.println("niha: "+2+3);         //niha: 23 
        System.out.println(2+3+" niha: "+2+3);    //5 niha: 23
        System.out.println(2+3+"niha:"+2+3);      //5niha:23

        
     
    }
    
}
 