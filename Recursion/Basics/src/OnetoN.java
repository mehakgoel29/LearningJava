public class OnetoN {
    public static void main(String[] args) {
        print(10);
    }
    static void print( int n ){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.println(n);
    }
}
