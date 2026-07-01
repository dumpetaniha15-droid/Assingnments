public class Increment {
    public static void main(String[] args){
        int a = 2;   
        int b = ++a;
        System.out.println(a); //3    (1+2 = 3)
        System.out.println(b); //3    (1+a=1+2 = 3)

        int c = 3;
        int d = --c;
        System.out.println(c); //2    (3-1 = 2)
        System.out.println(d); //2     

        int m = 4;
        int n =m++;
        System.out.println(m); //5   (4+1 = 5)
        System.out.println(n); //4     [[only in the post increment or decrement the one value will be same]] 

        
        int o = 5;
        int p = o--;
        System.out.println(o); //4    (5-1 = 4 )
        System.out.println(p); //5    
    }
}

// NOTE :pre-increment lo 2 values change avthai, but post-increment lo matram only one value ehh change avthadi
  