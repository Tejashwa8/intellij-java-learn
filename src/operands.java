package com.company;
import java.util.Scanner;
public class operands {
    public static void main(String[]args){
        int a = 2;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of b :");
       b=sc.nextInt();
        int c= a+b;
       System.out.println( b);
        System.out.println(c);

        float d = 9;
        float f = 80 %d;
               System.out.println(f);
                int e = 10;
                e /= 5;
                System.out.println(e);
                System.out.println(65<67 && 65>66);
                System.out.println(45<67 || 45>66);

    }

}

//Types of Operators in Java (List)

//Arithmetic Operators – + , - , * , / , %
//Assignment Operators – = , += , -= , *= , /= , %=
//Relational (Comparison) Operators – == , != , > , < , >= , <=
//Logical Operators – && , || , !
//Unary Operators – + , - , ++ , -- , !
//Bitwise Operators – & , | , ^ , ~ , << , >>
//Ternary Operator – ?:
