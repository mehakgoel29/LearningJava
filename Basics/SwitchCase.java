import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        /*
         == checks both the value and the ref .
         for example a="mehak" and b="mehak" ...their value is same but their ref is diff .
         so == will give false in this case.
         thats why we use .eqaulsto() because it only checks value.
        */
         Scanner sc= new Scanner(System.in);

         //OLD METHOD
         //String fruits=sc.next();
         /*switch (fruits) {
            case "mango":
                System.out.println("is sweet fruit");
                break;
            case "apple":
                System.out.println("is a healthy fruit");
                break;
            case "orange":
                System.out.println("is a citric fruit");
                break;

            default:
                System.out.println("enter a valid choice");
                break;
         }*/


         //NEW METHOD
         int days= sc.nextInt();
         switch (days) {
            case 1,2,3,4,5->System.out.println("weekdays");
            case 6,7->System.out.println("weekends");
            default->System.out.println("enter a valid number");
         }
         sc.close();
    }
}


