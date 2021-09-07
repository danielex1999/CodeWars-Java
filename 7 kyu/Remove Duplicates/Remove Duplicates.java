import static java.util.stream.IntStream.of;

public class UniqueArray {
  public static int[] unique(int[] integers) {
    return of(integers).distinct().toArray();
  }
}
