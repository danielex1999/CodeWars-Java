public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
    int result = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            final int compare = Integer.parseInt(digits.substring(i, i+5));
            result = Math.max(result, compare);
        }
        return result;
    }
}
