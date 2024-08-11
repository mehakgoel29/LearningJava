public class AlphabetBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            //sb+=ch  will not work 
            sb.append(ch); // Append character without formatting
        }
        System.out.println(sb.toString()); // Convert StringBuilder to String and print
    /*
    printing a StringBuilder directly can work because the System.out.println method will call toString() 
    on it automatically. However, using sb.toString() explicitly has a few advantages.
    This improves code readability and helps others (or future you) understand that you're working with a String value.
    Although in most cases the performance difference is negligible, explicitly calling toString() 
    might be slightly more efficient in some contexts because it avoids the overhead of implicit conversions.
    */
    }

}
