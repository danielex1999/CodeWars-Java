public class SimpleFun {

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int afterday = 0;
        int afternight = 0;

        while (afterday < desiredHeight) {
            afterday = upSpeed + afternight;
            afternight = afterday - downSpeed;
            days++;
        }

        return days;
    }
}
