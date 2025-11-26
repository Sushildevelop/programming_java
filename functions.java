package Basic.programming_java;

public class functions {
    public static void printHello(){
        System.out.println("Hello world");
    }

    public static  int sumFun(int x,int b){ //parameters or formal parameters
        int sum=x+b;
       return sum;
    }

    // what happens in Memory?.
//    Call stack   - where create a stack frame .

    // Call By Value - chnages  show only inside only function , not in main functions

    // Call by reference

     public static int factorial(int n ){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
     }


     // Binomail Coefficient
    public static  int binCoeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int b_fact=factorial(n-r);
        int fact=n_fact/(r_fact*b_fact);
        return fact;
    }


    // Function OverLoading
    // multiple functions with the same name but different parameters .
    // It doesn't depend upon return type .
    public static int sum(int a, int b){
        return a+b;
    }

    public  static int sum(int a , int b ,int c){
        return a+b+c;
    }

    // Function overloading - using Data Types
    public  static int sum1(int a,int b){
        return a+b;
    }

    public  static float sum1(float a, float b){
        return a+b;
    }

    // Prime or not
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    // Binary to Decimal
    public static void binary_to_decimal(int n){
        int myNum=n;
        int pow=0;
        int decimal=0;

        while(n>0) {
            int last_digits=n%10;
            decimal=decimal+(last_digits*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+myNum + "= "+decimal);

    }

    public static void decimal_to_binary(int n){
        int myNum=n;
        int pow=0;
        int bin=0;
       while(n>0){
           int rem=n%2;
            bin=bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
       }
        System.out.println("Binary ="+myNum +" "+bin);
    }

    public static void main(String args[]){
//        printHello();
//    int sum= sumFun(4,5); // arguments or actual parameters
//        System.out.println(sum);
//
//
//        factorial(4);
//        System.out.println(  factorial(4));
//
//        System.out.println(binCoeff(5,2));
//
//        System.out.println(sum(3,5));
//        System.out.println(sum(5,8,9));
//
//        System.out.println(isPrime(3));

//        binary_to_decimal(101);

        decimal_to_binary(9);

        // Method Scope - variable only used inside a function

        // Block Scope - if any variable implement inside a block then it only access inside block.



    }
}
