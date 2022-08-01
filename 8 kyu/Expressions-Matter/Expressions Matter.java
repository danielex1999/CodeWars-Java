public class Kata{
    public static int expressionsMatter(int a, int b, int c){
      int result1=a*(b+c);
      int result2=a*b*c;
      int result3=a+b*c;
      int result4=(a+b)*c;
      int result5=a+b+c;
      int max = result1;

    if (result2 > max)
        max = result2;
    if (result3 > max)
        max = result3;
    if (result4 > max)
        max = result4;
    if (result5 > max)
        max = result5;
     return max;
  }
}
