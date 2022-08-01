public class Kata{
  public static long[] powersOfTwo(int n){
    long[] numbers = new long[n+1];
    for(int i = 0; i<=n;i++){
      numbers[i] = (long) Math.pow(2,i);
    }
    return numbers;
  }
}
