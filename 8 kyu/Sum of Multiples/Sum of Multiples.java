public class Kata {
    public static long sumMul(int n, int m) {
      //(positive integers)
      if(n <= 0 || m <= 0) throw new IllegalArgumentException();
      //Exclude m
      if(m%n==0){
        m=m-1;
      }
      //Declaration
        int max_size=m/n,sum=0;
        long result=0;
        
      for(int i=0;i<max_size;i++){
        sum=sum+n;
        result=result+sum;
      }
      return result;
    }
}
