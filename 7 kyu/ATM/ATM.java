public class ATM {

    public int solve(int n) {
        int nominal = 0;
        int[] values = {500, 200, 100, 50, 20, 10};
        for (int result : values) {
            nominal += n / result;
            n %= result;
        }
        if (n == 0) {
            return nominal;
        } else {
            return -1;
        }
    }

}
