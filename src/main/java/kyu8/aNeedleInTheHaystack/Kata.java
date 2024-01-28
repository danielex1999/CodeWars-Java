package kyu8.aNeedleInTheHaystack;

public class Kata {
    public static String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "needle be lost, yo";
    }
}