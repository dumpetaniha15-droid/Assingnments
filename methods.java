public class methods {
    static int e=2;
    static int f=3;
    public static void main(String[] args){
        System.out.println(add(10,20));
        System.out.println(sub());
        System.out.println(mull());
        System.out.println(div( 10,5));


    }
    public static int add(int a ,int b){
       return a+b;
    }

    public static double sub(){
        double c=10.5;
        int d=5;
     return c-d;
    }

    public static int mull(){
        return e*f;
    }

    public static int div(int a,int b){
        return a/b;
    }

       

    
}