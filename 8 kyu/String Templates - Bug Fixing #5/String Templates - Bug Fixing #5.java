public class Kata{
    public static String buildString(String... args){
      
      return String.format("I like %s!",String.join(", ", args));
      
    }
}
