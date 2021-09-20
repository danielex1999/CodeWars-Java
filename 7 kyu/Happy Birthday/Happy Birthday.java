public class WrapPresent {

    public static int wrap(int height, int width, int length) {
        System.out.println(height + "," + width + "," + length);
        if (height <= width && height <= length) {
            return 4 * height + 2 * width + 2 * length + 20;
        } else if ((width <= length && width <= height)) {
            return 2 * height + 4 * width + 2 * length + 20;
        } else {
            return 2 * height + 2 * width + 4 * length + 20;
        }

    }
}
