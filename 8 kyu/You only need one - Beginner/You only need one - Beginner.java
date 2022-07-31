import java.util.Arrays;
import java.util.List;
public class Solution {

    public static boolean check(Object[] a, Object x) {
    List<Object> list = Arrays.asList(a);
    if(list.contains(x)){
      return true;
    }else{
      return false;
    }
  }
}
