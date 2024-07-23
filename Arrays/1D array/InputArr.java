import java.util.Scanner;
import java.util.Arrays;

public class InputArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("element at index "+i+" is ");
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of arrays are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); //to print tonly elements 
        }
        System.out.println();
        System.out.println("in array format");
        System.err.println(Arrays.toString(arr)); //to print elements in array format
        sc.close();
    }
}
