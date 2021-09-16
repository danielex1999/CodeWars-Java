public class Square {    
    public static boolean isSquare(int n) {  
      if(n < 0){
        return false;
      }     
      if(Math.sqrt(n) == (int) Math.sqrt(n)){
        return true;
      }else{
        return false;
      }
}
  }
