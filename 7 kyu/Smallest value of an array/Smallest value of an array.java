public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    int valor=Integer.MAX_VALUE;
    int variable=0;
    
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]< valor){
        variable=i;
        valor=numbers[i];
      }
    }
    if(toReturn.equals("value")){
      return valor;
    }else{
      return variable;
    }
  }
}
