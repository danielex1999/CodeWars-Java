public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {

      if(!(toRepeat instanceof String)){
      return "Not a string";
      }else{
        return String.valueOf(String.valueOf(toRepeat).repeat(n));
      }
  }
}
