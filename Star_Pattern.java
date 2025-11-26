package Basic.programming_java;

public class Star_Pattern {
    public  static  void main(String args[]){
//        int n=4;
//        for(int i=0;i<=n-1;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // Ouput
        // *
        //**
        //***
        //****
        //*****


        //Inverted
//        int n=4;
//        for(int i=1; i <=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // Output
        //****
        //***
        //**
        //*

        // Print Half-pyramid pattern
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Output
        //1
        //12
        //123
        //1234

        // Print character Pattern
        int n=4;
        char ch='A';
        // outer loop
        for (int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
