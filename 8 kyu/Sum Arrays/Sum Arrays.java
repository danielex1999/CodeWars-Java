public class SumArray {

  public static double sum(double[] numbers) {
    double result=0;
    for(int i=0;i<numbers.length;i++){
      result=result+numbers[i];
    }
    return result;
  }
}
