import java.util.Arrays;

public class GiftSorter{
  public String sortGiftCode(String code){
    char[] result = code.toCharArray();
    Arrays.sort(result);
    return new String(result);
  }
}
