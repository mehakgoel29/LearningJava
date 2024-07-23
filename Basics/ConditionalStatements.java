import java.util.Scanner;

public class ConditionalStatements {
    /*
     multiline comments 
     if-else statement for two cases 
     if, else if, else statement for multiple cases 
     */

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        if (salary<10000){
            salary+=2000;
        }
        else if(salary>20000) {
            salary+=5000;
        }
        else{
            System.out.println("no bonus granted");
        }
        System.out.println("your Salary :"+salary);
        sc.close();
     }
}


