import org.apache.commons.math3.util.Precision;
public class Geometry{
  public static double squareArea(double A){
    double result=Math.pow(2 * A / Math.PI,2);
    return Precision.round(result,2);
  }
}
