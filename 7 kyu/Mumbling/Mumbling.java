public class Accumul {
    
    public static String accum(String s) {
      String st=s.toLowerCase();
     StringBuilder result= new StringBuilder();
      for(int i=0;i<st.length();i++){
        result.append(Character.toUpperCase(st.charAt(i)));
        if(i==0){
          result.append("-");
        }else{
          String str = Character.toString(st.charAt(i));
          String repeated = str.repeat(i);
          result.append(repeated);
          
          if(i==st.length()-1){
            result.append("");
          }else
          result.append("-");
          }
      }
    return result.toString();
    }
}
