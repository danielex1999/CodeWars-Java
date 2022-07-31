public class Eratosthenes {
/*
Math.atan2 is an inbuilt method in Java that is used to return the
theta component from the polar coordinate
*/

    public static double circumference(double h, double l, double d) {
        return 2 * Math.PI * d / Math.atan2(l, h);
    }
}
