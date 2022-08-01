import java.util.*;
import java.util.stream.Collectors;
public class ReverseWords{

 public static String reverseWords(String str){
   
         List<String> words = Arrays.asList(str.split(" "));
     Collections.reverse(words);
     return words.stream().collect(Collectors.joining(" "));
 }
}
