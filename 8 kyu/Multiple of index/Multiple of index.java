import java.util.*;
import java.util.stream.IntStream;

public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    return IntStream.range(1, array.length).filter(n -> array[n]%n == 0).map(n -> array[n]).toArray();
  }
}
