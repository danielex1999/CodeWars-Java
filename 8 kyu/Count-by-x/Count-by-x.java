public class Kata {
    public static int[] countBy(int x, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }
}