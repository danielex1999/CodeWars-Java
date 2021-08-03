public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
  boolean truelove=false;
  boolean flor1,flor2;
  //Si es diferente a 0
  flor1 = (flower1 % 2) == 0;
  flor2 = (flower2 % 2) == 0;
    if(flor1!=flor2){
      truelove=true;
    }
  return truelove;
    
  }
  
}
