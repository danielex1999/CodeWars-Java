public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = (temp - 32) * 5/9.0;
        if (c <= 0)
            return (c+ " is freezing temperature");
        else
            return (c+ " is above freezing temperature");
    }
}
