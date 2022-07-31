public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum1=0;
    int sum2=0;
    int result=0;
    for( int num : arr1) {
          sum1 = sum1+num;
      }
        for( int num : arr2) {
          sum2 = sum2+num;
      }
    result=sum1+sum2;
    return result;
  }

}
