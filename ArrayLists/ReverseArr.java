import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        int arr[]=new int[size];
        int temp[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Reversal: "+Arrays.toString(arr));
        for (int i = arr.length; i>0; i--) {
            temp[i]=arr[i];
        }
        System.out.println("Arra");
    }
}