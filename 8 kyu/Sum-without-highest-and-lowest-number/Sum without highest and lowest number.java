public class Kata {

  public static int sum(int[] numbers) {
  
    if (numbers == null || numbers.length < 2) {
      return 0;
    }
    
    int min = numbers[0];
    int max = numbers[0];
    int sum = 0;
    for (int result : numbers) {
      min = Math.min(min, result);
      max = Math.max(max, result);
      sum += result;
    }
    
    return sum - min - max;
  }
  
}
