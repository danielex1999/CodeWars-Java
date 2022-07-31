public class FakeBinary {
    public static String fakeBin(String numberString) {
    StringBuilder result =new StringBuilder();
      for(int i=0;i<=numberString.length()-1;i++){
       char num = numberString.charAt(i);
        int comp=Character.getNumericValue(num);  
        if( comp >= 5){
          result.append("1");
        }else{
          result.append("0");
        }
        System.out.println(num);
      }
      return result.toString();
    }
}
