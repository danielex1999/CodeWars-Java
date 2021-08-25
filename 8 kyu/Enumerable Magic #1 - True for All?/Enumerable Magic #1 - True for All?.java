import java.util.function.IntPredicate;

public class Solution{
  public static boolean all(int[] list, IntPredicate predicate) {
    
    for (int i : list)
      if (!predicate.test(i))
        return false;
    
      return true;
  }
}
