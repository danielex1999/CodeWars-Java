public class LuckyNumber {
  
  public static boolean isLucky(long n) {
    int sum=0;
      if(n==0){
        return true;
      }
      while(n>0){
      sum=sum+(int)(n%10);
      n/=10;
      }
    
    if(sum%9==0){
      return true;
    }else{
      return false;
    }
  }
}
