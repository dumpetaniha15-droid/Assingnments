public class logical {
    public static void main(String[] args){
      //logical AND:

        int marks = 85;  
        int attendence = 75;
      
        boolean Qualified = (marks>45) && (attendence<=75);  //(85>45)true && (75<=75)true  , true+true=true
        boolean promoted = (marks==85) && (attendence>80);    //(85==85)true && (75>80)false , true+false=false
       
        System.out.println(Qualified); //true
        System.out.println(promoted);  //false

        //logical OR:

        boolean passed = true;
        boolean regular = true;

        System.out.println(passed || regular);         // true||true , true+true=true   
        System.err.println(passed || !regular);        //true ||!true=false  , true+false=true       

    }

}

//NOTE:1. logical AND: Two conditions should be true if any one is false then output is false
//    :2. logical OR : not like (logicalAND) if any one condition is true then ouput is true 
