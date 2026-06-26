public class returntype3 {
    public static void main(String[] args){
        
        System.out.println(sum(5,5));
        System.out.println(name("Niharika"));
        System.out.println(grade('A'));
   }
   public static int sum(int a, int b){
     int sum=a + b;
    return sum;
   }
   public static String name(String name){
     return name;
   } 
   public static char grade(char grade){
     return grade;
   }
  
    
}
