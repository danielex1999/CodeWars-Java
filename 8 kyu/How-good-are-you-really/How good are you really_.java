public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int total=0;
    for(int i=0;i<classPoints.length;i++){
      total=total+classPoints[i];
    }
    if((total/classPoints.length)<=yourPoints){
      return true;
    }else{
      return false;
    }
  }
}
