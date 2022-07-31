public class Kata {

    public static String integrate(int coefficient, int exponent) {
    int multi=0;
    int div=0;
    
    div=exponent+1;
    multi=coefficient/div;
      
    return multi+"x^"+div;
    }
  
}
