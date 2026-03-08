package com.company;
// Precedence and  associativity
public class operands_02 {
  public static void main(String[] args) {
 int a = 6;
 int b =8;
 int c =10;
 int d = a * c + b / a - c * b ;

 System.out.println(d);

 float e = 24.5f / 65.4f - 5.65f * 43.34f / 20f;
  System.out.println(e);
// QUIZ
      int x = 10;
      int y = 20;
 int f = x * y / 2;
 System.out.println(f);

 int g = b*b - (4*a*c) / (2*a) ;
 System.out.println(g);

 int v= 8;
 int u=2;
 int h = v*v - u*u;
 System.out.println(h);

 int i = a*b-d;
 System.out.println(i);
  }
}

/*
 Operator precedence decides **which operator is evaluated first,
  while associativity decides the order of evaluation when operators have the same precedence (left-to-right or right-to-left).

| Precedence Level | Operators                  | Associativity |              |              |
| ---------------- | -------------------------- | ------------- | ------------ | ------------ |
| 1 (Highest)      | `( )` Parentheses          | Left → Right  |              |              |
| 2                | `++  --  !  ~`             | Right → Left  |              |              |
| 3                | `*  /  %`                  | Left → Right  |              |              |
| 4                | `+  -`                     | Left → Right  |              |              |
| 5                | `<<  >>  >>>`              | Left → Right  |              |              |
| 6                | `<  <=  >  >=  instanceof` | Left → Right  |              |              |
| 7                | `==  !=`                   | Left → Right  |              |              |
| 8                | `&`                        | Left → Right  |              |              |
| 9                | `^`                        | Left → Right  |              |              |
| 10               | `                          | `             | Left → Right |              |
| 11               | `&&`                       | Left → Right  |              |              |
| 12               | `                          |               | `            | Left → Right |
| 13               | `?:` (Ternary Operator)    | Right → Left  |              |              |
| 14 (Lowest)      | `=  +=  -=  *=  /=  %=`    | Right → Left  |              |              |


Precedence determines which operator is evaluated first.
Associativity determines the order of evaluation when operators have the same precedence.
*/