import java.util.*;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort(Comparator.naturalOrder());
    return textbooks;
  }
}
