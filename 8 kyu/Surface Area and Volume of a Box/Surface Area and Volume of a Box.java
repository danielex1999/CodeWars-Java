public class Kata {
    public static int[] getSize(int w,int h,int d) {
     int result[]= new int [2];

      if(w==h && h==d && w==d){
        result[0]=6*(h*h);
        result[1]=(h*h*h);
      }else{
        result[0]=2*(w*h+w*d+h*d);
        result[1]=w*h*d;
      }
      return result;
        
    }
}
