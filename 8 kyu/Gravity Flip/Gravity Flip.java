import java.util.Arrays;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
    int n = arr.length;
    Arrays.sort(arr);
    if (dir == 'L') {
      for (int i = 0; i < n / 2; i++) {
        int t = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = t;
      }
    }
    return arr;
  }
}
