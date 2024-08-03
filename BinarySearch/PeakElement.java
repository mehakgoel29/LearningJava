public class PeakElement {

    /*
     peak element is the element in the array before which the series is in ascending order and 
     after that element in the series are in descending order 
     example:1 3 1 ...peak is 3 
     */
    public static void main(String[] args) {
        int []nums={1,2,3,4,3,2,1,4,1};
        int ans= findPeakElement(nums);
        System.out.println(ans);
        
    }
    static int findPeakElement(int[] nums) {
       int start=0;
       int end=nums.length-1;
       while (start<end) {
        int mid=start+(end-start)/2;
        if(nums[mid]<nums[mid+1]){
            //we are in ascending part of the array
            // because we know that mid+1 element > mid element
            start=mid+1;
        }
        else{
            // we are in dec part of array
            //but we have to search in the left portion so that's why end!= mid+1;
            end=mid;
        }
       }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
       return nums[start]; //or return end beacuse they both will point to the same number
    }
}
