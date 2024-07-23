public class EvenDigits {
    public static void main(String[] args) {
        int []arr={18,124,9,1764,98,1};
        System.out.println(countDigits(arr));
    }
    static int countDigits(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int num=arr[i];
            if(num==0){
               count=1;
            }
            else{
                while(num>0){
                    count++;
                    num=num/10;
                }
                if(count%2==0){
                    ans++;
                }
            }
        }
        return ans;
    } 
}
