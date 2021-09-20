public class Kata {

    public static String vowel2Index(String s) {
        var result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                result.append(i + 1);
            } else {
                result.append(s.charAt(i));
            }

        }
        return result.toString();
    }
}
