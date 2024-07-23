import java.util.Scanner;

public class PrimeRange {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first limit");
    int init=sc.nextInt();
    System.out.println("enter the last limit");
    int last=sc.nextInt();
    System.out.println("Prime numbers between "+init+" and "+last+" are: ");
    sc.close();
    for (int i = init; i <=last; i++) {
        boolean isPrime = true;
            for (int j = 2; j*j<=i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    
}





