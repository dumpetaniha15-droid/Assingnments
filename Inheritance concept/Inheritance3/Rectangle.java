package Inheritance3;

public class Rectangle extends Shape {
    int length;
    int width;

 Rectangle(String colour, int length, int width){
    super(colour);
    this.length = length;
    this.width = width;
 }
 void display(){
    System.out.println("colour : " + colour);
    System.out.println("lenght : " + length);
    System.out.println("width  : " + width);
    System.out.println("Area   : " + (length*width));
 }
}// Area = length*width
