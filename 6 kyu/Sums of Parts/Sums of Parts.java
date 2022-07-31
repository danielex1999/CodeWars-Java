class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] sums = new int[ls.length + 1];
        for (int l : ls) {
            sums[0] += l;
        }
        for (int i = 1; i < ls.length; i++) {
            sums[i] = sums[i - 1] - ls[i - 1];
        }
        return sums;
    }
}
