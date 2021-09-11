class RobinsonCrusoe {
    
    public static double[] crusoe(int n, double d, double ang, double distmult, double angmult) {
     double[] result = new double[2];
    for (ang = Math.toRadians(ang); n > 0; n--, d *= distmult, ang *= angmult) {
      result[0] += d * Math.cos(ang);
      result[1] += d * Math.sin(ang);
    }
    return result;
  }
}
