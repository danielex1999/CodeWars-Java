public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    String result="";
    if(n%12==0){
      result="CoffeeScript";
    }else if(n%6==0){
      result="JavaScript";
    }else if(n%3==0){
      result="Java";
    }else{
      result="mocha_missing!";
    }
    return result;
  }
}
