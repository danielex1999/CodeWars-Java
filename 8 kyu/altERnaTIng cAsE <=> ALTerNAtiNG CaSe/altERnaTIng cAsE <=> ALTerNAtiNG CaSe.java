public class StringUtils {
  
  public static String toAlternativeString(String string) {
   char[] arr = string.toCharArray();
        for(int i = 0;i<arr.length;i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (Character.isUpperCase(arr[i])) {
                    arr[i] = Character.toLowerCase(arr[i]);
                } else {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return new String(arr);
  }
}
