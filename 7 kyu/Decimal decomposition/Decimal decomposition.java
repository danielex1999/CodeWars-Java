public class DecimalDecomposition {

    public static String decimalDecomposition(int number) {

        int amount = String.valueOf(number).length();
        var result = new StringBuilder();
        int space = 0;
        for (int i = amount; i >= 1; i--) {
            int caracter = Character.getNumericValue(String.valueOf(number).charAt(space));
            space++;
            if (caracter == 0) {
                result.append("");
            } else {
                result.append((caracter * (int) Math.pow(10, i - 1)) + "+");
            }
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

}
