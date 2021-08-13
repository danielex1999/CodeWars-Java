public class Kata {
    public static int nextId(int[] ids) {
        int minId = 0;
        for (int i = 0; i < ids.length;) {
            if (minId == ids[i]) {
                minId += 1;
                i = 0;
            } else {
                i++;
            }
        }
        return minId;
    }
}
