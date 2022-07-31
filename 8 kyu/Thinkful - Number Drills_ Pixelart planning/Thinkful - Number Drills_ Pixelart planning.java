public class Kata {

  public static boolean isDivisible(int wallLength, int pixelSize) {
    if(wallLength%pixelSize ==0){
      return true;
    }else{
      return false;
    }
  }
}
