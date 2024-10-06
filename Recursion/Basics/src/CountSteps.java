public class CountSteps {

    //we have to count the number of steps taken to reach 0 from that number
    //if the number is odd then subtract one from it
    //if the number is even then divide it by 2
    public static int Count(int num , int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return Count(num/2,steps+1);
        }
        return Count(num-1,steps+1);
    }

    public static void main(String[] args)
    {
        System.out.println(Count(81,0));
    }
}
