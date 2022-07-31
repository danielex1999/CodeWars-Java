import java.util.Arrays;
import java.util.stream.IntStream;
public class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
   return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
  }
}
