public class Kata {
    public static String reverseLetter(final String str) {
      var result= new StringBuilder();
      result.append(str.replaceAll("[^a-z]", "")).reverse();
      return result.toString();
    }
}
