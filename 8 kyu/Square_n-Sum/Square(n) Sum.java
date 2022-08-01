public class Kata
 {
  public static int squareSum(int[] n){ 
    int result=0;
  for(int i=0;i<n.length;i++){
    result=(int)Math.pow(n[i],2)+result;
    System.out.println(result);
  }
    return result;
  }
 }
