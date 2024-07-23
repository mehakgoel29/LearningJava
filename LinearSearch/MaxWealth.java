public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr={{2,5},{6,2},{3,4,56,7}};
        int max=0;
        int richestCustomer = -1; 
        for (int person= 0; person < arr.length; person++) {
            int rowsum=0;
            for (int account = 0; account  < arr[person].length; account ++) {
              rowsum=rowsum+arr[person][account ];
            }
            if(rowsum>max){
                max=rowsum;
                richestCustomer=person;
            }
        }
        System.out.println("customer "+(richestCustomer+1)+" is the richest with maximun wealth "+max);
        }
}
