public class Deletion {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 4, 5, 6 };
        int key = 1;
        int pos = -1;

        // Find the position of the element to be deleted
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element to be deleted not found");
        } 
        else {
            // Delete the element by shifting the elements to the left
            for (int i = pos; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Print the array after deletion
            for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            }
        }
    }
}
