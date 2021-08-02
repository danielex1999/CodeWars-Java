public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int min = numbers[0];
    int max = numbers[numbers.length - 1];
    int size = max - min + 1;
    int[] result = new int[size];
    for (int i = 0; i < size; i++){
      result[i] = i + min;
    }
    return result;

}
  }
