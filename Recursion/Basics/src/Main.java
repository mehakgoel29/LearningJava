public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(-5));
    }
    public static int fibo(int n ){
        // base case
        if(n<0){
            return 0;
        }
       if(n<2) {
           return n;
       }
       return fibo(n-1)+fibo(n-2);
    }
}
