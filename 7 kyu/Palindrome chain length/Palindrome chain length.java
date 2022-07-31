public class Palindromes {
  
    public static int palindromeChainLength (long n) {
      String str = n + "";
      String result = new StringBuilder(str).reverse().toString();
      if (result.equals(str)) {
        System.out.println("is Palindrome");
        return 0;
      } else {
        int i = 1;
        do {
          n += Long.parseLong(result);
          str = n + "";
          result = new StringBuilder(str).reverse().toString();
          System.out.println("str: " + str);
          if (result.equals(str)) {
            return i;
          }
          
          i++;
        } while (true);
      }
    }
}
