public class Kata{
  public static boolean smallEnough(int[] a, int limit){
    for ( int i = 0; i < a.length; i++){
      if ( a[i] > limit ) {
      return false;
      }
    }
    return true;
  }
}
