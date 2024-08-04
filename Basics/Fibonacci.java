import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0;   
        /*
         The int type can only hold numbers up to about 2 billion (2,147,483,647). 
         The 56th (say) Fibonacci number is much larger than that, so it can't fit in an int and causes problems.
         To fix this, we use the long type instead of int. 
         The long type can hold much larger numbers, up to about 9 quintillion (9,223,372,036,854,775,807).
         */
        long b = 1;
        int count = 2;
        System.out.print(a + " " + b + " "); // Print the first two numbers separately

        while (count < n) { // Adjusted to print n numbers in total
            long temp = a;
            a=b;
            b=temp+a;
            count++;
            System.out.print(b + " "); // Print b after updating it
        }
        sc.close();
    }
}

