public class MissingNumber {
    public static int findMissing(int[] nums) {
        int n = nums.length +1;  // because the total numbers will be 4 in the end even if now it is 3
        int sum = n * (n + 1) / 2;
        for (int num : nums) {  //for(int i =0 ; i< nums.length ;i++)
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums={1,4,3};
        System.out.println(findMissing(nums));
    }
}
