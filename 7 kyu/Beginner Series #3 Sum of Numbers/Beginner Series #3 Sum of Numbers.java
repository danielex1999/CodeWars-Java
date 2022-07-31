  public class Sum
  {
     public int GetSum(int a, int b)
     {
       int result=0;
      if(a<b){
        for(int i=a; i <= b; i++){
          result=result+i;
        }
      }else{
        for(int i=b; i <= a; i++){
          result=result+i;
        }}
       return result;
  }
    }
