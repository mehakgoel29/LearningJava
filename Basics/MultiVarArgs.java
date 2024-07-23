import java.util.Arrays;

public class MultiVarArgs {
    static void multiple(int a,int b , String ...v){
        System.out.println(a+b+Arrays.toString(v)); 
        //will not work as concatenation btwn a and b thats why we convert it into string
        /*
        multi vargs or variale length arguments can only be added at last 
         */
        System.out.println(String.valueOf(a) +" "+ String.valueOf(b)+" " + Arrays.toString(v));
    }
    public static void main(String[] args) {
        multiple(2,3,"mehak","kunal","aayush","maa","papa");
    }
}
