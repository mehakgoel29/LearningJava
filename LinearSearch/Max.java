public class Max {
    public static void main(String[] args) {
        int [] arr={100,4,5,2000,90,34};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
