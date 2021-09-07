public class Printer {
    
    public static String printerError(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
          if(s.charAt(i) > 109){
            result++;
          }
        } 
        return result + "/" + s.length();
    }
}
