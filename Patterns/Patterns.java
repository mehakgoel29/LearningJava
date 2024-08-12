public class Patterns{
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern17(4);
        pattern28(5);
        pattern30(5);
    }
    static void pattern1(int n ){
    /*
    *****
    *****
    *****
    *****
    *****
     */
    System.out.println("pattern 1");
    for (int rows = 1; rows<=n; rows++) {
        for (int cols = 1; cols<=n; cols++) {
        System.out.print("* ");
        }
        System.out.println();
    }
    }
    static void pattern2(int n ){
    /*

    *
    **
    ***
    ****
    *****

    */
    System.out.println("pattern 2");

    for (int rows = 1; rows<=n; rows++) {
        for (int cols = 1; cols<=rows; cols++) {
        System.out.print("* ");
        }
        System.out.println();
    }
    }
    
    static void pattern3(int n ){
    /*

    *****
    ****
    ***
    **
    *
    */
    System.out.println("pattern 3");

    for (int rows=n; rows>=0; rows--) {
        for (int cols = 1; cols<=rows; cols++) {
        System.out.print("* ");
        }
        System.out.println();
    }
    }
    static void pattern4(int n){
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    System.out.println("pattern 4");

    for (int rows = 1; rows<=n; rows++) {
        for (int cols = 1; cols<=rows; cols++) {
        System.out.print(cols+" ");
        }
        System.out.println();
    }
    }
    static void pattern5(int n) {
    System.out.println("pattern 5");

        // Upper part of the pattern
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int rows = n - 1; rows >= 1; rows--) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern6(int n) {
        /*

         *
        **
       ***
      ****
     *****

         */
        System.out.println("pattern 6");
        // Print the pattern
        for (int rows = 1; rows <= n; rows++) {
            // Print spaces
            for (int cols = n - rows; cols > 0; cols--) {
                System.out.print(" ");
            }
            // Print stars
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {
        /*
            *****
             ****
              ***
               **
                *
        */
        System.out.println("pattern 7");
        // Print the pattern
        for (int rows = 1; rows <= n; rows++) {
            // Print spaces
            for (int spaces = 1; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            // Print stars
            for (int stars = n - rows + 1; stars > 0; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        /*

        *
       ***
      *****
     *******
    *********
    
        */
        System.out.println("pattern 8");
        // Print the pattern
        for (int rows = 1; rows <= n; rows++) {
            // Print spaces
            for (int spaces = n-rows; spaces>=0; spaces--) {
                System.out.print(" ");
            }
            // Print left stars
            for (int stars =1; stars <=rows; stars++) {
                System.out.print("*");
            }
            //print right stars
            for (int stars =1; stars <rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern17(int n) {
        /*

         1
        212
       32123
      4321234
       32123
        212
         1
    
        */
        System.out.println("pattern 17");
        // Print upper portion
        for (int rows = 1; rows <= n; rows++) {
            // Print spaces
            for (int spaces = n-rows; spaces>0; spaces--) {
                System.out.print(" ");
            }
            // Print left numbers
            for (int left =rows; left>0;left--) {
                System.out.print(left);
            }
            //print right nums
            for (int right =2; right <=rows; right++) {
                System.out.print(right);
            }
            System.out.println();
        }
        //lower portion
        for (int rows = n - 1; rows > 0; rows--) {
            // Print spaces
            for (int spaces = n - rows; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            // Print left numbers
            for (int left = rows; left > 0; left--) {
                System.out.print(left);
            }
            // Print right numbers
            for (int right = 2; right <= rows; right++) {
                System.out.print(right);
            }
            System.out.println();
        }}
        static void pattern28(int n) {
            /*
    
           *
          * *
         * * *
         * * *
          * *
           * 
        
            */
            System.out.println("pattern 28");
            // Print upper portion
            for (int rows = n; rows>0; rows--) {
                // Print spaces
                for (int spaces =rows-1; spaces>0; spaces--) {
                    System.out.print(" ");
                }
                for (int stars =n-rows+1; stars>0; stars--) {
                    System.out.print("* ");
                }
               
                System.out.println();
            }
            //lower portion
            for (int rows = 1; rows<=n; rows++) {
                // Print spaces
                for (int spaces =rows-1; spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (int stars =n-rows+1; stars>0; stars--) {
                    System.out.print("* ");
                }
                System.out.println();
            }


            
}
static void pattern30(int n) {
    /*

     1
    212
   32123
  4321234

    */
    System.out.println("pattern 30");
    // Print upper portion
    for (int rows = n; rows >0; rows--) {
        // Print spaces
        for (int spaces = rows-1; spaces>0; spaces--) {
            System.out.print(" ");
        }
        for (int nums=n-rows+1; nums>0; nums--) {
            System.out.print(nums);
        }
        for (int nums=2; nums<=n-rows+1; nums++) {
            System.out.print(nums);
        }
        System.out.println();

    }
   
    }}
          

