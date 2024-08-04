public class Occurances {
    public static void main(String[] args) {
        char[] arr={'a','b','a','c','a'};
        char target='a';
        int ans= CountOccurances(arr, target);
        System.out.println(ans);

    }
    static int CountOccurances(char [] arr,char target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]==target){
             count++;
         }   
    }
    return count;
}
}
