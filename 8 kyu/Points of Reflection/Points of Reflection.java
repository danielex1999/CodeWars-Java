package cw;

public class Reflections {
  
  public static int[] reflectPoint(int[] p, int[] q) {
    
    int result_x = p[0] + 2 * (q[0] -p[0]);
    int result_y = p[1] + 2 * (q[1] -p[1]);
    
    return new int[]{result_x,result_y};
  }
  
}
