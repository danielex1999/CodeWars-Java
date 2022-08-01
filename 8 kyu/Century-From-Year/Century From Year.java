public class Solution {
  public static int century(int number) {
    double anio=(double)number/100;
    double resp=Math.ceil(anio);
   return (int)resp;
  }
}
