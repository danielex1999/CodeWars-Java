class Generator {

    public static String nickname(String name) {

        if (name.length() < 4) {
            return "Error: Name too short";
        }
        if (String.valueOf(name.charAt(2)).matches("[aeiou]")) {
            return name.substring(0, 4);
        } else {
            return name.substring(0, 3);
        }
    }
}
