public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if(name.toLowerCase().charAt(0) =='r'){
      return name+" plays banjo";
    }else{
      return name+" does not play banjo";
    }
  }
}
