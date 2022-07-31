public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    if (arr.length < 2) return 0;
    int max = arr[0], min = max;
    for (int a : arr) if (a > max) max = a; else if (a < min) min = a;
    return max - min;
  }
}
