import java.util.Arrays;

public class SmashWords {

  public static String smash(String... words) {
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<words.length;i++){
      if(i ==words.length-1){
        sb.append(words[i]);
      }else{
        sb.append(words[i]+" ");
      }
    }
    return sb.toString();
  }
}
