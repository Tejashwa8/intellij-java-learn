package com.company;
public class datatypes {
public static void main(String[]args){
    byte p = 5;
    float y = 6.32f;
    Character Ch = 'A';
    String s = "Jasxxx";
    short z = 8;
    int a = p + z;
    float b = 2.2f * y;
    int c = 3+a;
    System.out.println("The sum of the values is: " +a);
    System.out.println("The Mul of the values is: "+b);
    System.out.println("The Sum of the values is: "+c);
 System.out.println("The Character is: "+Ch);
 System.out.println("The String is: " + s);

 // Increment
    int m = 34;
    int n = 87;
    int r = ++n;

    System.out.println(m++);
    System.out.println(m);
    System.out.println(++m);
    System.out.println(m=m+1);
    System.out.println(r);

    int e = 7;
    int f = ++e * 8;
    System.out.println(f);
    System.out.println(++Ch);
}
}

/*
//Result = byte + short -> integer
//Result = short + integer -> integer
//Result = long + float -> float
//Result = integer + float -> float
//Result = character + integer -> integer
//Result = character + short -> integer
//Result = long + double -> double
//Result = float + double -> double

| Operator | Name           | Description                    | Example |
| -------- | -------------- | ------------------------------ | ------- |
| `++a`    | Pre-increment  | Increases value **before use** | `++a`   |
| `a++`    | Post-increment | Increases value **after use**  | `a++`   |
| `--a`    | Pre-decrement  | Decreases value **before use** | `--a`   |
| `a--`    | Post-decrement | Decreases value **after use**  | `a--`   |

 */