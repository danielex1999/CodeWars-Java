public class Solution {

  private static final double G = 6.67e-11;

  public static double solution(double[] arrVal, String[] arrUnit) {
    double m1 = normalizeWeight(arrVal[0], arrUnit[0]);
    double m2 = normalizeWeight(arrVal[1], arrUnit[1]);
    double r = normalizeDistance(arrVal[2], arrUnit[2]);
    return (G * m1 * m2) / (r * r);
  }
  
  private static double normalizeWeight(double weight, String unit) {
    switch (unit) {
      case "kg":
        return weight;
      case "g":
        return weight / 1000;
      case "mg":
        return weight / 1000000;
      case "μg":
        return weight / 1000000000;
      case "lb":
        return weight * 0.453592;
      default:
        throw new IllegalArgumentException();
    }
  }
  
  private static double normalizeDistance(double distance, String unit) {
    switch (unit) {
      case "m":
        return distance;
      case "cm":
        return distance / 100;
      case "mm":
        return distance / 1000;
      case "μm":
        return distance / 1000000;
      case "ft":
        return distance * 0.3048;
      default:
        throw new IllegalArgumentException();
    }
  }
}
