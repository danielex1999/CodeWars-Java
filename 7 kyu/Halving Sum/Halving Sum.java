public class HalvingSum {
    public int halvingSum(int n) {
        return n == 0 ? 0 : n + halvingSum( n / 2);
    }
}
