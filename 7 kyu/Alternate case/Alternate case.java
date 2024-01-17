class Kata {
    static String alternateCase(final String string) {
        var result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                result.append(Character.toLowerCase(string.charAt(i)));
            } else {
                result.append(Character.toUpperCase(string.charAt(i)));
            }
        }
        return result.toString();
    }
}
