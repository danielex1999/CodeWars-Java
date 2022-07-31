public class Switch {

    public static String switcheroo(String x) {
        var result = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                result.append("b");
            } else if (x.charAt(i) == 'b') {
                result.append("a");
            } else {
                result.append(x.charAt(i));
            }
        }
        return result.toString();
    }
}
