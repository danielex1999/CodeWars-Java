public class Order {
    public static int getNum(String string) {
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                num = Character.getNumericValue(string.charAt(i));
                break;
            }
        }
        return num;
    }

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String string = "";
        String[] wordArr = words.split(" ");

        for (int i = 0; i < wordArr.length - 1; i++) {
            for (int j = 0; j < wordArr.length - 1 - i; j++) {
                if (getNum(wordArr[j]) > getNum(wordArr[j + 1])) {
                    String buff = wordArr[j];
                    wordArr[j] = wordArr[j + 1];
                    wordArr[j + 1] = buff;
                }
            }
        }

        return String.join(" ", wordArr);
    }
}
