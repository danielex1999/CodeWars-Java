import java.util.*;
public class NumberFun {
  public static long findNextSquare(long sq) {
      double num = Math.sqrt(sq);
      if((num % 1) == 0) {
        return (long)((num+1)*(num+1));
      }
       return -1;
  }
}
