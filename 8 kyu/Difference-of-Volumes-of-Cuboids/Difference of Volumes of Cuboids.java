public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int result=0;
    int first=1;
    int second=1;
//First
    for(int i=0;i<firstCuboid.length;i++){
      first=first*firstCuboid[i];
    }
//Second
    for(int i=0;i<secondCuboid.length;i++){
      second=second*secondCuboid[i];
    }
    if(first < second){
      result=second-first;
    }else{
      result=first-second;
    }
    
      return result;
  }
}
