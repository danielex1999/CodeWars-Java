import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        Collections.reverse(binary);
        
        int result = 0;
        
        for(int i = 0; i < binary.size(); i++){
          if(binary.get(i) == 1)
            result+= Math.pow(2, i);
        }
        
        return result;
    }
