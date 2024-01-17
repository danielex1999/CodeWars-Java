public class Solution {

    public static int closeCompare(double a, double b) {
        if (a == b) return 0;
        if (a < b) return -1;
        return 1;
    }

    public static int closeCompare(double a, double b, double margin) {
        if (Math.abs(a - b) <= margin) return 0;
        if (a < b) return -1;
        return 1;
    }
}
