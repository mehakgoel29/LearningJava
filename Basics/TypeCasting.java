import java.util.Scanner;

public class TypeCasting {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //automic type casting can be done only when the LHS is greater than RHS 
        //for example float a = 67;
        // float is greater than the 67 (which is a int)

        int a= (int)(34.89f);
        System.out.println(a);


        //automatic type promotion in expressions 
        byte b = (byte)(2570);  //257%256   256 size of byte
        System.out.println(b);

        int number='a';   //ASCII value
        System.out.println(number);


        // In Java, a byte is a small number type that can hold values from -128 to 127.
        // When you do arithmetic with byte variables, Java automatically converts the result to a bigger number type 
        // called int to make sure there's enough room for the result.
        // So when you do c = c * 2;, Java changes c * 2 into an int.
        // Then, it tries to put this int result back into the byte variable c,
        // which causes a problem because an int is bigger than a byte.
        // To fix this, you need to tell Java to convert the int result back to a byte.
        // You can do this with a cast, like this:
        byte c=30;
        c= (byte)(c*2);
        System.out.println(c);
        sc.close();
    }

}
