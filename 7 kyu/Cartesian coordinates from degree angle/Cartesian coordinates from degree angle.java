import java.awt.geom.Point2D;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
    return new Point2D.Double(
        Math.round(radius * Math.cos(Math.toRadians(degrees)) * 10e9) / 10e9,
        Math.round(radius * Math.sin(Math.toRadians(degrees)) * 10e9) / 10e9);
  }
  

}
