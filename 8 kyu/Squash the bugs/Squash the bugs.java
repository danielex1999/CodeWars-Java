import java.util.*;

public class Kata {

  public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i<spl.length; i++) {
      if (spl[i].length() > longest) {
        longest = spl[i].length();
      }
      }
      return longest;
  }
  
}
