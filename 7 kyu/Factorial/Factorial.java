public class Factorial {
  public int factorial(int n) {
  int result=1;
  if(n < 0 || n > 12) throw new IllegalArgumentException();
    for(int i=1;i<=n;i++){
      result= result*i;
    }
      return result;
    }
  }
