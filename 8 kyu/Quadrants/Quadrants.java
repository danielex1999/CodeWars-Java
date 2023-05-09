public class Kata {

    public static int quadrant(int x, int y) {
        int result = 0;
        //Euclidean plane I
        if (x > 0 && y > 0) {
            result = 1;
        }
        //Euclidean plane II
        if (x < 0 && y > 0) {
            result = 2;
        }
        //Euclidean plane III
        if (x < 0 && y < 0) {
            result = 3;
        }
        //Euclidean plane IV
        if (x > 0 && y < 0) {
            result = 4;
        }
        return result;
    }
}