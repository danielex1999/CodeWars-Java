public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
    int result=10000;
      for(int i=0;i<args.length;i++){
        if(result > args[i]){
          result=args[i];
        }else{
          result=result;
        }
      }
      return result;
    }
}
