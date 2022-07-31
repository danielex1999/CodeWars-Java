import org.apache.commons.math3.util.Precision;
public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
return Precision.round(number,2);
  }
}
