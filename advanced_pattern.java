package Basic.programming_java;

public class advanced_pattern {
     // Hollow Rectangle function
    public static void hollow_rectangle(int totalrows,int totalcols){
        // Print Hollow Rectangle Pattern
        //*****
        //*   *
        //*   *
        //*****
//        1.  total line - total -rows - outer loops
//        bundary - row-1,4
//                colum-1,5
//        Boundary - row=1|| col=1|| row=4 || col=5
        // Outer Loop
        for(int i=1;i<=totalrows;i++){
            // Inner-Columns
            for(int j=1;j<=totalcols;j++){
                //cell -(i,j)
                if(i==1|| i==totalrows || j==1||j==totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // inverted and rotated half-pyramid
    public  static  void inverted_rotated_half_pyramid(int totalrows){
        // 1 . Lines outer loop -(1 to 4)
        // 2 . space _stars
        //   *
        //  **
        // ***
        //****
        for(int i=1;i<=totalrows;i++){
            //spaces
            for (int j=1;j<=totalrows-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inverted_half_pyramid(int n){
        // Line - outer loops
        // j- n-i+1
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int  n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    //
    public static void triangle_0_1(int n){
//        (i+j) -> even -> '1'
        // (i+j) -> odd -> '0'
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print('1');
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    //
    public  static  void butterfly_pattern(int n){
       // outer loops - n times run - 1 st half
       // stars + spaces + stars
         // i +2x(n-i) + (i)
        for (int i=1;i<=n;i++){
            // stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // star -i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2 half
//        outer loops descending
        for(int i=n;i>=1;i--){

            // stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // star -i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public  static void rhombus(int n){
        // stars = n(j=1 to n)
        // spaces = (n-i) (j=1 to (n-1))
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static  void main(String args[]) {
        System.out.println("Hollow Rectangle");
//        hollow_rectangle(4,5);
        System.out.println("Inverted Rotated Half Pyramid");
        inverted_rotated_half_pyramid(4);

        System.out.println("Inverted half pyramid");
        inverted_half_pyramid(5);

        System.out.println("Floyds Triangle");
        floyd_triangle(5);

        System.out.println("Triangle 0 - 1");
        triangle_0_1(5);

        System.out.println("Butter fly Pattern");
        butterfly_pattern(5);

        System.out.println("Rhombus");
        rhombus(5);



    }
}

