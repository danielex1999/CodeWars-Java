public class EasyWallpaper {

    public String wallpaper(double l, double w, double h) {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        return l > 0 && w > 0 && h > 0 ? numbers[(int) (.4423 * h * (l + w))] : "zero";
    }
}
