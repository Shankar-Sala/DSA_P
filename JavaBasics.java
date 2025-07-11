// public class JavaBasics{
//   public static void main(String args[]){
//    byte a = 8;
//    System.out.println(a);
//    char ch = 'a';
//    System.out.println(ch);
//    boolean var = false;
//    float pencil = 10.5;
//    int number = 10;
//    //long
//    //double
//    short n = 240;
//   }
// }


//Questions
//1. Sum of a & b

// public class JavaBasics{
//   public static void main(String args[]){
//     //code to calculate sum
//     int a = 10;
//     int b = 20;
//     int sum = a + b;
//     System.out.println(sum);
//   }
// }

// Input in Java Language
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     // String input = sc.next();
//     // System.out.println(input);

//     // String input = sc.nextLine();
//     // System.out.println(input);

//        int number = sc.nextInt();
//     System.out.println(number);

//         float price = sc.nextFloat();
//     System.out.println(price);

//   }
// }

// sum of a and b by taking input 
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number A: ");
//     int A = sc.nextInt();
//     System.out.print("Enter Number B: ");
//     int B = sc.nextInt();
//     int sum = A + B;
//     System.out.println("Sum of A and B is "+ sum);
//   }
// }


// product of A and B 
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter Number A: ");
//     int A = sc.nextInt();
//     System.out.print("Enter Number B: ");
//     int B = sc.nextInt();
//     int product = A * B;
//     System.out.println("Product of A and B is "+ product );
//   }
// }

// Area of circle
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner SC = new Scanner(System.in);
//     System.out.print("Enter Radius of Circle: ");
//     float radius = SC.nextFloat();
//     float area = 3.14f * radius * radius;
//     // double area = 3.14 * radius * radius;
//     System.out.println("Area of Circle = "+ area);
//   }
// }


// // Type Casting
// public class JavaBasics{
//   public static void main(String args[]){
//     float a = 25.12f;
//     int b = (int)a;
//     System.out.println(b);
//   }
// }

//Operators in Java Language
// 1. Arithmetic Operator 

// public class JavaBasics{
//   public static void main(String args[]){
//     int A = 10;
//     int B = 5;

//     System.out.println("Sum of A and B = "+ (A+B));
//     System.out.println("Sub of A and B = "+ (A-B));
//     System.out.println("Mul of A and B = "+ (A*B));
//     System.out.println("Div of A and B = "+ (A/B));
//     System.out.println("Modulo of A and B = "+ (A%B));
//   }
// }

// 2. Relational Operator 

// public class JavaBasics{
//   public static void main(String args[]){
//     int a = 10;
//     int b = 20;

//     System.out.println(a == b); //false
//     System.out.println(a != b); //true
//     System.out.println(a > b); //false
//     System.out.println(a < b); //true
//     System.out.println(a >= b); //false
//     System.out.println(a <= b); //true
    
//   }
// }


//3. Logical Operator

// ________________________________________________________________________________________

// Chp-2 Conditional Statements 

// public class JavaBasics{
//   public static void main(String args[]){
//     int age = 15;
//     if(age >= 18){
//       System.out.println("Adult: drive, Vote");
//     }
// if (age > 13 && age < 18){
//   System.out.println("teenager");
// }

//     else{
//       System.out.println("not adult");
//     }
//   }
// }

// Print the largest of 2 numbers
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     int A = 30;
//     int B = 5;

//     if (A > B){
//       System.out.println("Number A is Greater "+A);
//     }else{
//       System.out.println("Number B is Greater "+B);
//     }
//   }
// }

// print if number is odd or Even 
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner SC = new Scanner(System.in);
//   System.out.print("Enter Any Positive Number: ");
//     int num = SC.nextInt();
//     if(num % 2 == 0){
//       System.out.println("Given Input Number is EVEN : "+num);
//     }else{
//       System.out.println("Given Input Number is ODD : "+num);
//     }
//   }
// }

//else if

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     int age = 13;
    
//     if(age >= 18){
//       System.out.println("adult");
//     }else if(age >= 13 && age < 18){
//       System.out.println("teenager");
//     }else{
//       System.out.println("child");
//     }
//   }
// }

//Income Tax Calculator
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
  
//   System.out.print("Enter Your Income: ");
//   float income = sc.nextFloat();

//   if(income < 500000){
//     System.out.print("0% tax: "+ income);
//   }else if(500000 <= income && 1000000 >= income){
//     System.out.print("20% tax: "+(income * 0.2));
//   }else{
//     System.out.print("30% tax: "+(income * 0.3));
//   }
//   }
// }

//Print the largest of 3
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number A: ");
//     int A = sc.nextInt();
//     System.out.print("Enter Number B: ");
//     int B = sc.nextInt();
//     System.out.print("Enter Number C: ");
//     int C = sc.nextInt();

//     if((A >= B) && (A>=C)){
//       System.out.print("Number A is Largest: "+A);
//     }else if(B>=C){
//       System.out.print("Number B is Largest: "+B);
//     }else{
//       System.out.print("Number C is Largest: "+C);
//     }
//   }
// }


//Ternary Operator
// Syntax:

// variable = condition ? true(stm-1) : false(stm-2)

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();

//     String result = (number % 2 == 0 )? "even" : "odd";

//     System.out.println(result);
//   }
// }
 
 //Question : Check if a student will Pass or Fail

// Marks >= 33 : PASS;
// marks< 33 : FAIL;

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your Marks: ");
//     int marks = sc.nextInt();

//     String result = (marks >= 33) ? "PASS" : "FAIL";
//     System.out.println(result);

//   }
// }

// Switch Statement

// public class JavaBasics{
//   public static void main(String args[]){
//     int number = 2;

//     switch(number){
//       case 1: System.out.println("Samosa");
//       break;
//       case 2: System.out.println("burger");
//       break;
//       case 3: System.out.println("mango shake");
//       break;
//       default: System.out.println("We wake up");

//     }
//   }
// }

// Calculator using switch

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//   int a = sc.nextInt();
//   int b = sc.nextInt();
//   char operator = sc.next().charAt(0);
   
//    switch(operator){
//     case '+': System.out.print("Sum of a and b is "+(a+b));
//     break;
//     case '-': System.out.print("Sub of a and b is "+(a-b));
//     break;
//     case '*': System.out.print("Mul of a and b is "+(a*b));
//     break;
//     case '/': System.out.print("div of a and b is "+(a/b));
//     break;
//     default: System.out.println("Please Enter Valid Operator");
//    }
//   }
// }

// Chp-13: Loops (Flow Control)
// import java.util.*;
// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
// int number = 0;
// while(number <= 100){
//   System.out.println("Hello World");
//   number++;
// }
// System.out.println("printed Hello world 100x");
//   }
// }

//Qs. Print number from 1 to 10

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Number: ");
//     int num = sc.nextInt();

//     while( num <= 10){
//       System.out.println(num);
//       num++;
//     }
//     System.out.println("Sir,This is your Output");
//   }
// }

// // Qs. Print sum of first n natural numbers 
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Number: ");
//     int num = sc.nextInt();
//     int sum = 0;
//     int i=1;

//     while(i<=num){
//       sum += i;
//       i++;
//     }
//     System.out.println("Sum of n natural number: "+ sum );
//   }
// }

//For loop

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     for(int i =1; i<= 10; i++){
//       System.out.println("Hello world");
//     }
//   }
// }

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     for(int line=1; line<=4; line++){
//       System.out.println("****");
//     }
//   }
// }

//print reverse of a number

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
    
//     System.out.print("Enter Your Number: ");
//     int n = sc.nextInt();
    
//     while(n > 0){
//       int lastDigit = n % 10;
//       System.out.print(lastDigit);
//       n /= 10;
//     }
//     System.out.println();
//   }
// }


// Reverse the given number 
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
     
//      System.out.print("Enter your number: ");
//      int n = sc.nextInt();
//      int rev = 0;

//      while(n > 0){
//       int lastDigit = n % 10;
//       rev = ((rev * 10) + lastDigit);
//       n /= 10;
//      }
//      System.out.println("Reverse of given number: "+ rev);
//   }
// }

//do-while loop
// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int counter = 1;
//     do{
//       System.out.println("Hello world");
//       counter++;
//     }while(counter <= 10);
//   }
// }

//Break statement
// public class JavaBasics{
//   public static void main(String args[]){
//     for(int i = 1; i <= 5; i++){
//       if(i==3){
//         break;
//       }
//       System.out.println(i);
//     }
//     System.out.println("I am out of the loop");
//   }
// }

//Qs. Keep entering numbers till user enters a multiple of 10 

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     do{
//       System.out.print("Enter your Number: ");
//       int n = sc.nextInt();
//       if(n % 10 == 0){
//          break;
//       }
//       System.out.println(n);
//     }while(true);
//   }
// }

//Continue Statement : to skip an iteration

// public class JavaBasics{
//   public static void main(String args[]){
//     for(int i =1 ; i <= 5; i++){
//       if(i ==3){
//         continue;
//       }
//       System.out.println(i);
//     }
//   }
// }

//Display all numbers entered by the user except multiples of 10

// import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     do{
//       System.out.print("Enter your number: ");
//       int n = sc.nextInt();
//       if(n % 10 == 0){
//         continue;
//       }
//       System.out.println(n);
//     }while(true);
//   }
// }

//Question
// Check if a number is prime or not 

import java.util.*;
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number: ");
    int n = sc.nextInt();
if(n == 2){
  System.out.println("N is prime number: "+n);
}else{
  boolean isPrime = true;
    for(int i=2; i<=n-2; i++){
      if(n % i == 0){
        isPrime = false;
      }
    }
    if(isPrime == true){
      System.out.println("N is prime number: "+n);
    }else{
      System.out.println("N is not prime number: "+n);
    }
}
   
  }
}