import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={2,2,7,2,1};
        System.out.println(searchIndex(arr,2,0));
        System.out.println(isPresent(arr,8,0));
        System.out.println(searchFromLast(arr,7,arr.length-1));
        findAllIndex(arr,2,0);
        System.out.println(list);
        ArrayList<Integer> list2= new ArrayList<>();
        System.out.println(findAllIndex(arr,2,0,list2));
        System.out.println(find(arr,2,0));
    }


    //Return the index of the target
    static int searchIndex(int[] arr , int target , int i ){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return searchIndex(arr,target,i+1);
    }


    //returns if the target is present or not
    static boolean isPresent(int[] arr , int target , int i ){
        if(i==arr.length){
            return false;
        }
        return (arr[i]==target) || isPresent(arr,target,i+1);

    }


    //returns index of the target when search from the last
    static int searchFromLast(int[] arr , int target , int i ){
        if(i<0){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return searchFromLast(arr,target,i-1);
    }


    //return the multiple occurrences of the target
    // when the arraylist is outside the function
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int target , int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==target){
            list.add(i);
        }
         findAllIndex(arr,target,i+1);
    }



    //return the multiple occurrences of the target
    // when the arraylist is passed as the argument in the  function
    //OPTIMIZED
    static ArrayList findAllIndex(int[] arr , int target , int i,ArrayList<Integer> list ){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return findAllIndex(arr,target,i+1,list);

    }


    //return the multiple occurrences of the target
    //arraylist inside the function
    //NOT OPTIMIZED 
    static ArrayList find(int[] arr , int target , int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ansFromoOtherCalls = find(arr,target,i+1);
        list.addAll(ansFromoOtherCalls);
        return list;
    }
}
