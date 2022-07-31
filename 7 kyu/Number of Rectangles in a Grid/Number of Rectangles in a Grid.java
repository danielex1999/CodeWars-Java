public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    return (((m*m) + m)*((n*n) + n))/4;
  }
  
}
