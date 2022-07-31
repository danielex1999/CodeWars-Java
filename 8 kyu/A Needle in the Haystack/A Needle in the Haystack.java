public class Kata {
    public static String findNeedle(Object[] haystack) {
    
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "needle be lost, yo";
    }
}
