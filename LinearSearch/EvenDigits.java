public class EvenDigits {
    public static void main(String[] args) {
        int []arr={18,124,9,1764,98,1};
        System.out.println(countDigits(arr));
    }
    static int countDigits(int[] arr){
        int EvenCount=0;
        for (int i = 0; i < arr.length; i++) {
            int DigitCount=0;
            int num=arr[i];
            if(num==0){
                DigitCount=1;
            }
            else{
                while(num>0){    // we are counting the number of digits in a number -> 234 ...it has 3 digits
                    DigitCount++;
                    num=num/10;
                }
                if(DigitCount%2==0){ // now here we are cheacking whether the number of digits are even in number or not 
                    EvenCount++;
                }
            }
        }
        return EvenCount;
    } 
}
