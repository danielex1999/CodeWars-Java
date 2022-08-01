public class Kata {

  public static String well(String[] x) {
    int g_count = 0;
    for (String word: x) {
      if (word == "good") {
        g_count++;
      }
    }
    switch (g_count) {
    case 0:
      return "Fail!";
    case 1:
    case 2:
      return "Publish!";
    default:
      return "I smell a series!";
    }
  }

}
