public class Union {
    public static void main(String[] args) {
        int arr1[]={2,4,2,6,7,8};
        int arr2[]={1,5,3,6,8};
        int Union[]={};
        for (int i = 0; i <arr1.length; i++) {
            if(arr2[i]==arr1[i]){
               Union[i]=i;
            }
        }
        for (int i : Union) {
            System.out.println(Union[i]);
        }
    }
}
