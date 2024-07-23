import java.util.Arrays;
import java.util.Scanner;
public class VarArgs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers do you want ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //System.out.println(arr);  
        /*will give result as [I@161b062a 
        To print the actual contents of the array, you need to use Arrays.toString(arr)
        */

        sc.close();
    }
    static void fun(int ...v){
       System.out.println(Arrays.toString(v));
       /*
        The Arrays.toString method is used to convert the contents of an array into a readable string format.
        When you call toString() on an array object directly, you get a string that includes the type of the array 
        and its memory address, which looks like [I@161b062a for an integer array. This is because the default
        toString method of the Object class (which arrays inherit) does not know how to print the contents of the array.
        The Arrays.toString() method, on the other hand, is a utility method specifically for arrays.
        It provides a human-readable string representation of the array's contents.
        For example, if you have an array arr with elements {1, 2, 3}, calling Arrays.toString(arr) 
        will return the string [1, 2, 3].
        */
    }
}

