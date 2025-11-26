package Basic.programming_java;
import java.util.*;
public class secondmodule {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in) ;
        // print if a number is Odd or Even

////        int number=sc.nextInt();
//        if(number%2==0){
//            System.out.println("Even ");
//        }else{
//            System.out.println("Odd");
//        }


        // Print the largest of 3
//        int a=40;
//        int b=50;
//        int c=60;
//        if((a>=b) && (a>=c)){
//            System.out.println("A is greater than C");
//        }else if (b>=c){
//            System.out.println("B is greater than C");
//        }
//        else{
//            System.out.println("C is greater than A and B");
//        }


        // Calculator
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        char operator=sc.next().charAt(0);
//        switch (operator){
//            case '+':
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//
//            case '%':
//                System.out.println(a%b);
//                break;
//
//            case '/':
//                System.out.println(a/b);
//                break;
//            default:
//                System.out.println("wrong operator");
//        }


       // Ternary Operator

        int a=10;
        int b=20;
        String op=(a>b)?"a is greater":"b is greater";
        System.out.println(op);




    }
}
