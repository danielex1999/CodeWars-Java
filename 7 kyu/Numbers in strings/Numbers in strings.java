class Solution {
    public static int solve(String s) {
        int result = 0;
        String first = s.replaceAll("[\\D]", " ");
        String[] second = first.split(" ");

        for (String value : second) {
            if (value.length() > 0 && result < Integer.parseInt(value)) {
                result = Integer.parseInt(value);
            }
        }
        return result;
    }
}
