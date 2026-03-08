package com.company;
import java.util.Scanner;
public class Example {
    public static void main(String[]args){
        System.out.println("Total Percentage Of The Student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the English marks : ");
        int English = sc.nextInt();
        System.out.println("Enter the Hindi marks : ");
        int Hindi = sc.nextInt();
        System.out.println("Enter the Mathematics marks : ");
        int Mathematics = sc.nextInt();
        System.out.println("Enter the Science marks : ");
        int Science = sc.nextInt();
        System.out.println("Enter the SST marks : ");
        int SST = sc.nextInt();

  float percentage = English+Hindi+Mathematics+Science+SST/ 500f *100;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
