import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a numer");
        int num1=sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        // When you use nextInt() to read a number, it reads the number but leaves a hidden "enter key press" behind.
        // This hidden "enter key press" is like an invisible character sitting in the input waiting to be read.
        // So, when you then try to use nextLine() to read a line of text, it just grabs that invisible character and
        // thinks it's done, without waiting for you to type anything new.
        // To fix this, you need to "consume" or get rid of that hidden "enter key press" before you try to read a line of text.
        // You do this by adding an extra nextLine() after reading the number, which essentially tells the scanner, 
        // "Hey, read and throw away that invisible character."
        
        System.out.println("enter a String");
        String num2=sc.nextLine();
        System.out.println("result= "+num1+num2);
        sc.close();
    }
}

