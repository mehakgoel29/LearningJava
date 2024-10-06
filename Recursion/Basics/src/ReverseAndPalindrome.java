public class ReverseAndPalindrome {
    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);
        System.out.println(reverse2(8907));
        System.out.println(palin(34554));
    }
    //way 1
    static int sum=0;
    static void reverse1(int n) {
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse1(n/10);
    }


    //way 2 : pure recursion
    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n, digits);
    }
    static int helper(int n , int digits){
        if(n%10==n){
            return n ;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }

    //palindrome: same from both side
    static boolean palin(int n ){
        return n==reverse2(n);
    }
}
