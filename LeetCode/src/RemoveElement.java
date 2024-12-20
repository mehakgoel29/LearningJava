import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static int remove(int arr[],int val){
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    public static int[] removeWithDeletion(int arr[],int val){
        int pos=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                pos=i;
                for (int j = pos; j < arr.length; j++) {
                    arr[i]=arr[i+1];
                }
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3 ,3,2,4,5,6};
        System.out.println(remove(arr,3));
        }
    }
