import java.text.DecimalFormat;
public class Solution {

    public static String findSquares(int n) {
        var result = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.#");
        double mayor = 0, menor = 0;
        for (int i = 1; i < 1000000; i++) {
            if (Math.pow(i, 2) - Math.pow(i - 1, 2) == n) {
                mayor = (double) Math.pow(i, 2);
                result.append(df.format(mayor));
                result.append("-");
                menor = (double) Math.pow(i - 1, 2);
                result.append(df.format(menor));
            }
        }
        return result.toString();
    }
}
