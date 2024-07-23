public class min {
    public static void main(String[] args) {
        int [] arr={1,4,-5,2000,90,34};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
