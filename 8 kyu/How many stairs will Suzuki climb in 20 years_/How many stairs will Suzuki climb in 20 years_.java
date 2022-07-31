public class Kata
{
    public static long stairsIn20(int[][] stairs){
       long result = 0;
       for (int i = 0; i < stairs.length; i++) {
         for (int x = 0; x < stairs[i].length; x++) {
           result += stairs[i][x];
         }
       }
       return result*20;
    }
}
