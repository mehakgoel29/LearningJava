import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("hello world!");  
        //hold ctrl and click thre keyword you want to know abt
        //system is a class that have out as a ref variable from printstream and println is also in printstream 

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.next());   //takes first string and removes all after space eg:hey how are you ->  hey
        System.out.println(sc.nextLine()); //takes entire line  eg:hey how are you -> hey how are you 

        sc.close();
    }
}

