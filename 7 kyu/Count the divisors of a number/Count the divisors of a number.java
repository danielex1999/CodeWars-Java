public class FindDivisor {

  public long numberOfDivisors(int n) {
   long result=0;
    for(int i=1;i<=n;i++){
            if (n%i == 0) {
                result++;
            }
      }
    return result;
  }

}
