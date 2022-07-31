import org.apache.commons.math3.util.Precision;
public class EasyLogs {

  public static double logs(double x, double a, double b) {
    double result=Math.log(a * b)/Math.log(x);

    return Precision.round(result,7);

  }

}
