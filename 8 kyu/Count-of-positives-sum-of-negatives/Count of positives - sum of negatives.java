public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input){
    if (input == null || input.length == 0) {
      int[] emptyArray = {};
      return emptyArray;
    }
    int nega=0;
    int posi=0;
    for(int i=0;i<input.length;i++){
      if(input[i]>0){
        posi++;
      } else{
        nega += input[i];
      } 
    }
    int[] returnValues = new int[] {posi, nega};
    return returnValues;
  }
}
