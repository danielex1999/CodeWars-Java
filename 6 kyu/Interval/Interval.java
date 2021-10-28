import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.common.primitives.Ints;
public class Math {

    public static int[] Interval(int[] arr, String str) {
 //Mistakes :v
  if(str.length()<5){
    return new int[0];
  }
//Declaracion      
        Matcher matcher = Pattern.compile("[-0-9]\\d{0,15}").matcher(str);
        List<String> coincidencias = new ArrayList<String>();
        while(matcher.find()){
            coincidencias.add(matcher.group());
        }
        int menor = Integer.parseInt(coincidencias.get(0));
        int mayor = Integer.parseInt(coincidencias.get(1));
        String first = String.valueOf(str.charAt(0));
        String second = String.valueOf(str.charAt(str.length()-1));
        ArrayList<Integer> result = new ArrayList<Integer>();

//------------------------FOR------------------------------      
        for (int i = 0; i < arr.length; i++) {
           Arrays.sort(arr);
//[a,b] 
            if (first.equals("[") && second.equals("]")) {
                if (arr[i] <= mayor && arr[i] >= menor) {
                    result.add(arr[i]);
                }
            }
//(a,b]  
            if (first.equals("(") && second.equals("]")) {
                if (arr[i] <= mayor && arr[i] > menor) {
                    result.add(arr[i]);
                }
            }          
//[a,b)  
            if (first.equals("[") && second.equals(")")) {
                if(arr[i] < mayor && arr[i] >= menor) {
                    result.add(arr[i]);
                }
            }
//(a,b)
            if (first.equals("(") && second.equals(")")) {
                if (arr[i] < mayor && arr[i] > menor) {
                    result.add(arr[i]);
                }
            }
          
        }
      
//----------------------------------------------------------
      int[] code = Ints.toArray(result);
      return code;
      
    }
}
