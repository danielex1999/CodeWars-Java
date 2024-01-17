public class Solution {
    public static String solve(final String str) {
        int size = str.length();
        int may = 0;
        int min = 0;
        if (size < 0) {
            return "";
        }
        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                may++;
            } else {
                min++;
            }
        }
        System.out.println(str);
        if (may < min) {
            return str.toLowerCase();
        } else if (may > min) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}
