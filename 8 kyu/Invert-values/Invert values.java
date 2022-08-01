public class Kata {
  public static int[] invert(int[] array) {
  int[] result =new int[array.length];
  for(int i=0; i<array.length;i++){
    if(array[i]<0){
      result[i]=array[i]+(-2*array[i]);
    }else{
      result[i]=array[i]-(2*array[i]);
    }
  }
    return result;
  }
}
