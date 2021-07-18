public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double div = (double)normPrice * discount/100;
    System.out.println(div);
    double result = hol/div;
    System.out.println(result);
  return (int) result;
    
  }

}
