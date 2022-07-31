public class School{

  public static int getAverage(int[] marks){
    int resultado=0;
    int division=marks.length;
  for(int i=0;i<marks.length;i++){
    resultado=marks[i]+resultado;
  }
    return resultado/division;
    }

}
