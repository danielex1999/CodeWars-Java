public class FirstNonConsecutive {
    static Integer find(final int[] array) {
      int error=6;
      for (int i=0;i<array.length-1;i++){
        if(array[i]+1!= array[i+1]){
          return error= array[i+1];
        }
      }
        return null;
    }
}
