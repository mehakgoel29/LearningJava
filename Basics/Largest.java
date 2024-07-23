import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number");
        int num2=sc.nextInt();
        System.out.println("enter 3rd number");
        int num3=sc.nextInt();

        int max= num1;
        if(num2>max){
            max=num2;
            System.out.println("largest num is "+max);
        }
        else if (num3>max){
            max=num3;
            System.out.println("largest num is "+max);

        }
        else{
            System.out.println("largest num is "+max);

        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int =sc.nextInt();
        int largest = Math.max(a,b);  //can only take 2 arguments
       System.out.println("largest number is "+largest);
        sc.close();


    }
}
