public class SquareDigit {

  public int squareDigits(int n) {
    StringBuilder result= new StringBuilder();
    String digito=String.valueOf(n);
    double p=2;
    for(int i=0;i<digito.length();i++){
      int compare=Integer.parseInt(String.valueOf(digito.charAt(i)));
      result.append((int)Math.pow(compare,2));
    }
    return Integer.parseInt(result.toString());
  }
}
