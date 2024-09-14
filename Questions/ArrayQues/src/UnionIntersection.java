import java.util.ArrayList;

public class UnionIntersection {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        ArrayList<Integer> unionList = new ArrayList<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();
        union(arr1, arr2, unionList);
        intersection(arr1, arr2, intersectionList);
    }
    private static void intersection(int[] arr1, int[] arr2, ArrayList<Integer> list) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!list.contains(arr1[i])) {
                        list.add(arr1[i]);
                    }
                    break;
                }
            }
        }
        System.out.println("Intersection: " + list);
    }

    private static void union(int[] arr1, int[] arr2, ArrayList<Integer> list) {
        for (int i = 0; i < arr1.length; i++) {
            if (!list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!list.contains(arr2[i])) {
                list.add(arr2[i]);
            }
        }

        System.out.println("Union: " + list);
    }
}



