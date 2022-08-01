import java.util.Arrays;
public class ArrayPrinter {

    public static String printArray(Object array[]) {
      String result = "";
      for(int i = 0; i < array.length; i++){
        if(i == array.length - 1){
         result += "" + array[i];
      }else{
          result += "" + array[i] + ",";
        }
      }
      return result;
    }
}
