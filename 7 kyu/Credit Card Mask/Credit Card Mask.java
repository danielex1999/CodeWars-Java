public class Maskify {
    public static String maskify(String str) {
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < str.length()-4;++i)
        {
        result.setCharAt(i,'#');
        }
       return result.toString(); 
    }
}
