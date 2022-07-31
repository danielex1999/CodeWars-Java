import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return Stream.of(text.split("\n"))
                .map(x -> substringComments(x, commentSymbols))
                .collect(Collectors.joining("\n"));
    }

    private static String substringComments(String str, String[] commentSymbols) {
        int index = -1;
        for (String commentSymbol : commentSymbols) {
            if (str.contains(commentSymbol)) {
                index = str.indexOf(commentSymbol);
                break;
            }
        }
        return ((index == -1) ? str : str.substring(0, index)).replaceAll("\\s+$", "");
    }
}
