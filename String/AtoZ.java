public class AtoZ {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i <26; i++) { // after 26 it will start printing symbols that go beyond the range of z
            char ch=(char)('a'+i);
            series+=ch;
        }
        System.out.println(series);
    }
}
