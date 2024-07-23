public class ReverseArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int start=0;
        int back=arr.length-1;
        while(start<back){
            int temp=arr[start];
            arr[start]=arr[back];
            arr[back]=temp;
            start++;
            back--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
