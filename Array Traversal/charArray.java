public class charArray{
      public static void main(String[] args) {
        char[] myGrade = {'A','B','C','D'};
        
        //using for loop:
        for(char i=0;i< myGrade.length;i++){
        System.out.println(myGrade[i]);
        }

        //using for-each loop:
        for(char grade : myGrade){
            System.out.println(grade);
        }
    }
}
