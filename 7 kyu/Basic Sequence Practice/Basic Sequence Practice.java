public class SequenceSum {

    public static int[] sumOfN(int n) {
        int value = 0;

        if (n > 0) {
            value = n + 1;
        } else {
            value = n + (n * -2) + 1;
        }

        int[] result = new int[value];

        for (int i = 0; i < value; i++) {
            if (i == 0) {
                result[i] = i;
            } else if (n > 0) {
                result[i] = result[i - 1] + i;
            } else {
                result[i] = result[i - 1] - i;
            }

        }
        return result;
    }
}
