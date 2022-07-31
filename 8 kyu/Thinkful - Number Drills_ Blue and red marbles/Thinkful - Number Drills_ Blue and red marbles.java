public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
     return (double)(blueStart-bluePulled)/(blueStart-bluePulled+redStart-redPulled);
  }
}
