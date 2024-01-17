public class SillyAdditon {

    public static int add(int num1, int num2) {
        var result = new StringBuilder();

        do {
            result.insert(0, num1 % 10 + num2 % 10);
        } while ((num1 /= 10) + (num2 /= 10) > 0);

        return Integer.parseInt(result.toString());
    }
}
