import java.util.List;

public class MixedSum {
int result=0;
  public int sum(List<?> mixed){  
     for (Object element:mixed) {
        if (element instanceof Integer){
          result += (Integer) element;
          } else if (element instanceof String) {
            result += Integer.parseInt( (String)element);
            }
      }
  return result;
  }
}
