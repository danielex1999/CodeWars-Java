public class Friends {
    public static int friends(int n) {
      int result = 0; 
      int m = 2;
      while (n > m) {
        result++;
        m = 2*m;
      }
      return result;
    }
}
