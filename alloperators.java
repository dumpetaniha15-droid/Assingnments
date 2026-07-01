public class alloperators {
      public static void main(String[] args){
          int a= 5;
          int b=5;

        //Arithmetic operators:
        System.out.println("a+b " +(a+b));
        System.out.println("a-b " +(a-b));
        System.out.println("a*b " +(a*b));
        System.out.println("a/b " +(a/b));
        System.out.println("a%b " +(a%b));

        //Relational operators:
        System.out.println("a==b " +(a==b));
        System.out.println("a!=b " +(a!=b));
        System.out.println("a<b " +(a<b));
        System.out.println("a>b " +(a>b));
        System.out.println("a>=b " +(a>=b));
        System.out.println("a<=b " +(a<=b));

        //Increment and Decrement operators:
        System.out.println("++a " +(++a));      
        System.out.println("a++ " +(a++));
        System.out.println("--a " +(--a));
        System.out.println("a-- " +(a--));

        //logical operators:
        System.out.println(a>4 && b<=5);  //true
        System.out.println(a>=5 || b>6);  //true 
        System.out.println(a>3 & b>6 );   //false
        System.out.println(a<6 | b>10);   //true
             //Note: && , ||->cheks only one condition 
             //      &  , | ->cheks both the conditions

      
       //compound assignment operators:
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b); // In every step the value is updated
      }
    }   
        
       





    

    
    

