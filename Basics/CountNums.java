import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        int match=sc.nextInt();
        while (n>0) {       // 122342
            int rem=n%10;   //2
            if(rem==match){
               count++;
            }
            n=n/10;          //12234
        }
        System.out.println(count);
        sc.close();
    }
}
