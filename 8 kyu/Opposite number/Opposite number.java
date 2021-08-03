public class Kata
    {
        public static int opposite(int number){
          int result=0;
        if(number<0){
          result=number+(-2*number);
        }else{
          result=number-(2*number);
        }
          return result;
        }
    }
