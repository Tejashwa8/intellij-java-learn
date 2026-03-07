package com.company;
import java.util.Scanner;
public class UserInput {
public static void main(String[]args){
    System.out.println("Taking I/P from the user");
    Scanner ts=new Scanner(System.in);
   System.out.println("Enter your number 1");
   int A=ts.nextInt();
   float a=ts.nextFloat();
   boolean b1=ts.hasNextInt();
   System.out.println("Enter your number 2");
   int B=ts.nextInt();
   float b=ts.nextFloat();
   boolean b2=ts.hasNextInt();
   int sum = A+B;
   float sub = a-b;
   System.out.println("The sum of the numbers are :");
   System.out.println(sum);
   System.out.println("The sub of the numbers are :");
   System.out.println(sub);
   System.out.println(b1);


}
}
