public class Kata{
  public static double find_average(int[] array){
    double total=0;
    for (int i=0;i<array.length;i++){
      total=total+array[i];
    }
    double result=total/array.length;
    return result;
  }
}
