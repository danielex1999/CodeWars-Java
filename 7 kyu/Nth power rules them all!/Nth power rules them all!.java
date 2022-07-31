public class Kata {

    public static int modifiedSum(int[] array, int power) {
        int result = 0;
        double power2 = 1, sum = 1;
        for (int i = 0; i < array.length; i++) {
            power2 = power2 + Math.pow(array[i], power);
            sum = sum + array[i];
        }
        result = (int) (power2 - sum);
        return result;
    }
}
