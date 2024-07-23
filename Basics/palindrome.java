public class palindrome {
    public static void main(String[] args) {
        //check palindrome

        int number = 121;
        int originalNumber = number;
        int palin = 0;
        while (number > 0) {
            int rem = number % 10;
            palin = palin * 10 + rem;
            number = number / 10;
        }
        if(palin==originalNumber){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        } 


        //print palindromes from 1 to 100
        for(int num=0;num<1000;num++){
            int originalNum = num;
            int palindrome = 0;
            int temp=num;
            while (temp > 0) {
                int rem = temp % 10;
                palindrome = palindrome * 10 + rem;
                temp = temp / 10;
            }
            if(palindrome==originalNum){
                System.out.println(num);
            }
        }
    }

}
