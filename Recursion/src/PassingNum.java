public class PassingNum {
    public static void main(String[] args) {
        fun(5);
    }

     static void fun(int n) {
        if(n==0){
            return ;
        }
         System.out.println(n);
         fun(n--);
         fun(--n);
         /*
         n-- vs --n
         n-- means : n=n-1 ...first it will pass and then decrease
         --n means : n-1=n....first it will subtract and then pass
         */
    }
}
