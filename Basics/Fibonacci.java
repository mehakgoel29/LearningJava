import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8...
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
        while (count <= n) {
            long temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
        sc.close();
    }
}