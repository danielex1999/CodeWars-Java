class Kata {
    public static String getMiddle(String word) {
        int middle = word.length() / 2;
        var result = new StringBuilder();

        if (word.length() % 2 == 0) {
            result.append(word.charAt(middle - 1));
            result.append(word.charAt(middle));
        } else {
            result.append(word.charAt(middle));
        }
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.charAt(middle));
        return result.toString();
    }
}
