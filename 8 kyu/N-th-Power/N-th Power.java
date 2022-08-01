public class Kata {
  public static int nthPower(int[] array, int n) {
    int result=1;
      if(array.length<=n){
        result=-1;
      }else{
        for(int x=0;x<n;x++){
          System.out.println(n);
          result=array[n]*result;
        }
      }
    return result;
  }
}
