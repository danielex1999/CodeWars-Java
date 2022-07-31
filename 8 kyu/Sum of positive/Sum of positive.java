public class Positive{

  public static int sum(int[] arr){
    int repuesta=0;
    for(int i=0;i < arr.length;i++){
      if(arr[i]>0){
      repuesta+=arr[i];
        }
    }
  
    return repuesta;
  }
}
