public class Armstrong {
    public static void main(String[] args) {
        // int num=153;
        // int originalNum=num;  //preserve the original number 
        // int sum=0;
        // while(num>0){
        //     int rem=num%10;
        //     int cube=rem*rem*rem;
        //     sum=sum+cube;
        //     num=num/10;
        // }
        // if(sum==originalNum){
        //     System.out.println("it is a armstrong");
        // }
        // else{
        //     System.out.println("not a armstrong");
        // }

                for (int i = 0; i < 100; i++) {
                    int sum = 0;
                    int originalNum = i;
                    int num = i;
                    while (num > 0) {
                        int rem = num % 10;
                        int cube = rem * rem * rem;
                        sum = sum + cube;
                        num = num / 10;
                    }
                    if (sum == originalNum) {
                        System.out.println(originalNum);
                    }
                }
            }
        }