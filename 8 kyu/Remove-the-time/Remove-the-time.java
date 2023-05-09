public class Solution {
    public static String shortenToDate(String longDate) {
        int numberTime = longDate.indexOf(',');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < longDate.length(); i++) {
            if (i == numberTime) {
                numberTime++;
            } else {
                result.append(longDate.charAt(i));
            }
        }
        return result.toString();
    }
}