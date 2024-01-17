public class Kata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (distanceToPump <= mpg * fuelLeft) {
            return true;
        } else {
            return false;
        }
    }
}
