public class Kata {

  public static boolean feast(String beast, String dish) {
    boolean caso = false;
    char beastfirst = beast.charAt(0);
    char dishfirst = dish.charAt(0);
    char beastlast = beast.charAt(beast.length() - 1);
    char dishlast = dish.charAt(dish.length() - 1);
    
    if( beastfirst == dishfirst && beastlast == dishlast){
      caso=true;
      }else{
        caso=false;
      }
    
     return caso;
  }
 
}
