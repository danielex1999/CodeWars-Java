public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        int max = 0;
        for (int i = 0; i <= bound; i++) {
            if (i % divisor == 0) {
                max = i;
            }
        }
        return max;
    }
}
