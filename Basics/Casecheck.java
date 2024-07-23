import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char word=sc.next().trim().charAt(0);   
        //trim removes all the extra spaces and charAt return the character at that index
        System.out.println(word);

        if(word>'a' && word<'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
        sc.close();

    }
}
