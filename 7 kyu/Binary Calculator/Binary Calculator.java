public class BinaryCalculator {
  public static String calculate(final String n1, final String n2, final String o) {
    int a = Integer.parseInt(n1, 2), b = Integer.parseInt(n2, 2);
  
    if(o.equals("add")){
      return Integer.toBinaryString(a+b);
    }else if(o.equals("multiply")){
      return Integer.toBinaryString(a*b);
    }else{
      return Integer.toBinaryString(a-b);
    }
  }
}
