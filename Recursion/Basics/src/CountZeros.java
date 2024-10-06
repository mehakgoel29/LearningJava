public class CountZeros {
    public static int Count(int num, int count){
        if(num==0){
            return count;
        }
        if(num%10==0){
            return Count(num/10,count+1);
        }
       return Count(num/10,count);
    }

    public static void main(String[] args) {
        System.out.println(Count(78009006,0));
    }
}
