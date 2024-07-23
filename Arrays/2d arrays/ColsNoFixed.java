import java.util.Arrays;

public class ColsNoFixed {
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {4,5},
            {6,7,8}
        };
       for (int rows = 0; rows< arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows])+" ");
        }
    }
}
