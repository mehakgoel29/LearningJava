public class SearchInString {
    public static void main(String[] args) {
        String name="mehak";
        // char key=2;     it is not giving any error because it convert it into unicode 
        char key='e'; 
        LinearSearch(name,key);
    }
    static void LinearSearch(String name, char key){
        boolean isFound=false;
      for (int i = 0; i < name.length(); i++) {
        if(key==name.charAt(i)){
            System.out.println("char found at index: "+i);
            isFound=true;
        }
      }
    if(isFound==false){
        System.out.println("char not found");
    }
}
}
