import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] resultado = list.toArray(arr);
        return resultado;
    }
}
