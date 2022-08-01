public class Kata {
  public static String chromosomeCheck(String sperm) {
    String result="";
    if(sperm == "XY")
      result="Congratulations! You're going to have a son.";
    
    if(sperm == "XX")
      result="Congratulations! You're going to have a daughter.";
    
    return result;
  }
}
