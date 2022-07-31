public class GCD {
    public static int compute(int x, int y) {
    int result = 0;
    for (int i = 1; i <= x && i <= y; i++) {
        if (x % i == 0 && y % i == 0) {
            result = i;
        }
    }
    return result;
    }
}
