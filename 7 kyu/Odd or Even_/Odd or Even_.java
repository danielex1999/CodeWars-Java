public class Codewars {
  public static String oddOrEven (int[] array) {
  int sum=0;
    if(array.length==0)
      return "even";
    
    for(int i=0;i<array.length;i++){
      sum=array[i]+sum;
    }
    
    if(sum%2==0){
      return "even";
    }else{
      return "odd";
    }
  }
}
