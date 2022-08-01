public class Solution {
    public static int areaOrPerimeter (int l, int w) {
      int result=0;
       if(l==w){
         result=l*l;
       }else{
         result=2*l+2*w;
       }
    return result;
    }
}
