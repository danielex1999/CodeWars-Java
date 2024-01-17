import java.util.Comparator;
import java.util.List;

class sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(Comparator.naturalOrder());
        return textbooks;
    }
}
