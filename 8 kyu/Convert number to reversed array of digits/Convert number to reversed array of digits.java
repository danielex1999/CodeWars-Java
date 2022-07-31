public class Kata {
  public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
  }
}
