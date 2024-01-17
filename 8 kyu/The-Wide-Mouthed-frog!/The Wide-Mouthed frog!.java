public class WideMouthedFrog {
    public static String mouthSize(String animal) {
        if (animal.toLowerCase().contains("alligator")) {
            return "small";
        } else {
            System.out.print(animal);
            return "wide";

        }
    }
}
