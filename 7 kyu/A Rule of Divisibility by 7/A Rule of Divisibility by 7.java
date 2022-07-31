import java.util.Arrays;

public class DivSeven {
    public static long[] seven(long m) {
        int cnt = 0;
        while (m > 99) {
            long a0 = m % 10;
            m = (m - a0) / 10 - 2 * a0;
            cnt++;
        }
        return new long[] {m, cnt};
    }
}
