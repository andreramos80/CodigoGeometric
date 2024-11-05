
//import java.util.Scanner;
import java.util.*;
class Area{
  public static void main (String[]args){
    Scanner s1=new Scanner(System.in);
   
    System.out.println("enter length of rectangle");
    double l=s1.nextDouble();
    
    System.out.println("Enter bredth of rectangle");
    double b=s1.nextDouble();
   
    double r=l*b;
    double r1=l*l;
    System.out.println("The area of rectangle is: " + r);
    System.out.println("The area of qd is: " + r1);
  }
}