public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return null;
        }
        int seconds = (3600 * g) / (v2 - v1);
        int[] time = new int[3];
        time[0] = seconds / 3600;
        time[1] = (seconds - time[0] * 3600) / 60;
        time[2] = (seconds - time[0] * 3600 - time[1] * 60);
        return time;
    }
}
