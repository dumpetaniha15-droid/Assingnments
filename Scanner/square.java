package Scanner;
import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = s.nextInt();
        int square = number*number;

        System.out.println("square of " + number + " is: " + square);
    }   
}
