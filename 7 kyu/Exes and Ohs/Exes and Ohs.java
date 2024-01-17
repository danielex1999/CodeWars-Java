public class XO {

    public static boolean getXO(String str) {
        int totalO = 0;
        int totalX = 0;
        String words = str.toLowerCase();
        System.out.println(words);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                totalO++;
            }
            if (str.charAt(i) == 'x') {
                totalX++;
            }
        }
        if (totalO == totalX) {
            return true;
        } else {
            return false;
        }
    }
}
