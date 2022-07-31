public class CC {
  public static int charCount(String str, char c) {
   int size=str.length();
   int result=0;
   char min=Character.toLowerCase(c);
   char max=Character.toUpperCase(c);  
    for(int i=0;i<size;i++){
      if(str.charAt(i)==min || str.charAt(i)==max){
        result++;
      }
    }
    System.out.println(str);
    return result;
  }
}
