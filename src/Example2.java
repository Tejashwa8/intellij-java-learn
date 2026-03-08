package com.company;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        // float eqn
        float a = 7f / 4f * 9f / 2f;
        System.out.println("The value of a is :" +a);

        // Encrypting
        char grade = 'C';
        grade = (char)(grade + 8); //(char) is typecasting
        System.out.println("The encrypted grade is :" +grade);

        // Decrypting
        grade = (char)(grade - 8);
        System.out.println("The decrypted grade is :" +grade);

        //  Expressions
        int v = 5;
        int u =10;
        int b = 2;
        int s = 4;
        int w = (v*v)-(u*u) /(2*b*s);
        System.out.println("The value of w is :" +w);

        int x = 7;
        int y= x * 49 / x + 35 / x;
        System.out.println("The value of y is :" +y);

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int m =  sc.nextInt();
System.out.println("The value of m is :" +m);
System.out.println(m>10);
    }
}
