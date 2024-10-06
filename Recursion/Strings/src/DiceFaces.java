import java.util.ArrayList;

public class DiceFaces {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceRet("",4));
    }
    static void dice(String result , int target){
        if(target==0){
            System.out.println(result);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {  //taken 6 because dice has 6 faces only
            dice(result + i, target - i);  //result + i  : concatenation because it's a string
        }

    }


    static ArrayList<String> diceRet(String result , int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(result + i, target - i));
        }
        return list;
    }


    static void diceFace(String result, int target, int face) {
        if (target == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(result + i, target - i, face);
        }
    }

}
