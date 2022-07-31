public class DeltaBits {
    public static int convertBits(int a, int b) {
      return Integer.bitCount(a ^ b);
    }
}
