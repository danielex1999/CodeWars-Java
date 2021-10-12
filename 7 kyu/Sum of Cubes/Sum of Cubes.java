public class Solution {

    public static long sumCubes(long n) {
        long result = 0;

        for (long i = 1; i <= n; i++) {
            result = result + (long) Math.pow(i, 3);
        }
        return result;
    }
}
