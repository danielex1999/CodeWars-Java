public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {

        int months = 0;
        double moneyLeft;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double savings = 0;

        while ((priceOld + savings) < priceNew) {
            months++;

            if (months % 2 == 0) {
                percentLossByMonth = percentLossByMonth + 0.5;
            }

            priceOld = priceOld - priceOld * (percentLossByMonth / 100);
            priceNew = priceNew - priceNew * (percentLossByMonth / 100);
            savings = savings + savingPerMonth;
        }

        moneyLeft = (savings + priceOld) - priceNew;

        return new int[]{months, (int) Math.round(moneyLeft)};
    }
}
