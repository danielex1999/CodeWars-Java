public class Kata {

    public static int stantonMeasure(int[] arr) {
        int stanton = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                stanton++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == stanton) {
                result++;
            }
        }
        return result;
    }
}
