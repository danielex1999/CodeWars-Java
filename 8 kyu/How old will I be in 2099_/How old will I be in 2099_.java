public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    String result;
    int number=0;
    if(birth>yearTo){
      number=birth-yearTo;
      if(number==1){
      result="You will be born in "+number+" year.";  
      }else{
      result="You will be born in "+number+" years.";
      }
    }else if(birth<yearTo){
      number=yearTo-birth;
      if(number==1){
      result="You are "+number+" year old.";
      }else{
      result="You are "+number+" years old.";
      }
    }else{
      result="You were born this very year!";
    }
    return result;
  }
}
