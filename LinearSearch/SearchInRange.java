public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={5,6,7,23,89,29,45};
        int key=23;
        boolean isFound=false;
        for (int i = 3; i < 7; i++) {
            if(arr[i]==key){
                System.out.println("element found at index: "+i);
                isFound=true;
                break;
            }
        }
        if(isFound==false){
             System.out.println("element not found");   
        }
    }
    }

