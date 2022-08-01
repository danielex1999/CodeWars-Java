public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        if(a==true && b==false){
          return true;
        }else if(a==false && b==true){
          return true;
        }else{
          return false;
        }
    }
}
