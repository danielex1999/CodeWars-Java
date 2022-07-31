import static java.util.stream.IntStream.range;
public class NthSeries {
  
  public static String seriesSum(int n) {
  double result=0;
    for(int i=0;i<n;i++){
      result=result+(1/(double)((3*i)+1));
    }
    return String.format("%.2f",result);
  }
}
