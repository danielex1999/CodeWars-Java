public class Kata {
    public static boolean consecutiveDucks(int n) {
        double result = Math.log(n) / Math.log(2);
        return result != (int) result;
    }
}
