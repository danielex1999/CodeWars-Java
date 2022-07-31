public class ZywOo {
  public static int[] take(int[] arr, int n) {
    
    if(n > 0 && arr.length >= n){
        int [] result = new int[n];
        for (int i = 0; i < n; i++ ){
            result[i] = arr[i];
        }
        return result;
      }
    if(n > 0 && arr.length < n) return arr;
    return new int[0];
      
  }
}
