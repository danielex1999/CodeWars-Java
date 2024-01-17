public class Kata {
    public static final String generateShape(int n) {
        String variable = "+";
        var result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                result.append(variable.repeat(n));
            } else {
                result.append(variable.repeat(n));
                result.append("\n");
            }
        }
        return result.toString();
    }
}
