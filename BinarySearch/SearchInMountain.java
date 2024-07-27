public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    public int findInMountainArray(int target,int[] mountainArr) {
        int peak =findPeakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length - 1);
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
        return start; //or return end beacuse they both will point to the same number
     }
 
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */
 
//  class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//         int peak = findPeakElement(mountainArr);
//         int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
//         if (firstTry != -1) {
//             return firstTry;
//         }
//         // try to search in second half
//         return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
//     }

//     static int findPeakElement(MountainArray arr) {
//         int start = 0;
//         int end = arr.length() - 1;
//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             if (arr.get(mid) < arr.get(mid + 1)) {
//                 // we are in ascending part of the array
//                 start = mid + 1;
//             } else {
//                 // we are in descending part of the array
//                 end = mid;
//             }
//         }
//         // in the end, start == end and pointing to the largest number because of the 2 checks above
//         return start; // or return end because they both will point to the same number
//     }

//     static int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr.get(start) < arr.get(end);

//         while (start <= end) {
//             // find the middle element
//             int mid = start + (end - start) / 2;

//             if (arr.get(mid) == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target < arr.get(mid)) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > arr.get(mid)) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }
