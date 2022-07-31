import java.util.ArrayList;
import java.util.Arrays;
class Solution{
    public static int [] solve(int [] arr){
            ArrayList<Integer> arrayList = new ArrayList<>();      
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        temp = j;
                    }
                }
                if (temp == i){
                    arrayList.add(arr[i]);
                }
            }
            int[] result = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                result[i] = arrayList.get(i);
            }
            return result;
    }
}
