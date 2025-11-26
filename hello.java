package Basic.programming_java;
import java.util.*;
public class hello {
        public static void main(String args[]){

           int sum=0;
           int a=0,b=1;
           sum =a+b;
            System.out.println(sum
            );
            System.out.println("Unary Operator");

            // Unary Operator
//            ++  --
            int z=1;
            int y=z++;

            System.out.println(y);

            int c=10;
            int o=--c;
            System.out.println(o);


                // Output In Java
            // Various types of Output
            System.out.println("Hello Baby");  // Line ka space or next line
            System.out.println("Hello spire\n");
            System.out.println("Hello Babu");
            System.out.println("Hello Babu");
            System.out.println("Hello Babu");


            // If we want output on same line then use print ,
            // if we want next line then println or "\n"

            // Relational Operators  == , != , > , < , >= , <=


            // logical Operators  - && , || , !
            System.out.println((3>2) && (5>2));

//            // Print star   * * * *
//                            * * *
//                            * *
//                            *

            System.out.println(" * * * *");
            System.out.println(" * * *");
            System.out.println(" * *");
            System.out.println(" *");


            // Assignment Operators
//            = , +=, -=, *=, /=
             int A=10;
             A+=10;  // A=A+10;
            int B=5;
            B*=5;
            System.out.println(B);

            System.out.println(A);



            // Input
         Scanner sc=new Scanner(System.in);
//         String input=sc.next(); // single word input
//         String input =sc.nextLine() // input paragraph
//         float price=sc.nextFloat()
//         System.out.println("then \n",input);

//            Scanner yy=new Scanner(System.in);
//         System.out.println("iNPUT 1");
//            int cc=yy.nextInt();
//         System.out.println("Ouput 2");
//            int bc=sc.nextInt();
//            int sum1=cc+bc;
//         System.out.println("sum = "+sum1);



         // product of a & b
//         int in=sc.nextInt();
//         int ou=sc.nextInt();
//
//         int product=in*ou;
//         System.out.println(product);



         // Type Conversion
//         Conversion happen when:
//         a. Type compatible.
//         b. destination type > source type
//         byte > short > int > float > long > double

//         int v=10;
//         long u=v;
//         System.out.println(u);

         // Type Casting - Java dosen't allow this but we can do forcefully .
         float pp=25.12f;
         int kk=(int)pp;
         System.out.println(kk);


         char ch='a';
         int number=ch;
         System.out.println(number);

         // Type Promotion in expressions
         // byte , short , char operand to int when evaluating an expression.
         char ab='a';
         char ba='b';
         System.out.println("Int value " +
                 ""+(int)(b));
         System.out.println((int)(ab
         ));

         System.out.println(ab-ba);



         //  Conditional Statements
         int khus=20;
         int sh=30;
         if(khus>sh){
          System.out.println("Khushi is greater then "+khus);

         }
         else{
          System.out.println("Shushil is greater then "+sh);
         }

        }


    }






