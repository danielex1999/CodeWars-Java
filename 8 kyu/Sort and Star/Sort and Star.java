import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
       return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));

  }
}
