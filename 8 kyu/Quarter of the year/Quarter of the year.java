public class Kata {
    public static int quarterOf(int month) {
     int result=0;
      if(month<=3){
        result=1;
      }else if (month > 3 && month<=6){
        result=2;
      }else if (month > 6 && month<=9){
        result=3;
      }else{
        result=4;
      }
      return result;
    }
}
