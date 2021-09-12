public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
       return (firstNumber + n/2) % n;
    }
}
