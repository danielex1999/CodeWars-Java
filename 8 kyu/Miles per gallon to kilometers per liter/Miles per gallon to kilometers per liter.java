import java.text.DecimalFormat;
public class Converter {
  public static float mpgToKPM(final float mpg) {
    float re = (float) (mpg/2.824810531496063);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    return Float.valueOf(decimalFormat.format(re));
  }
}
