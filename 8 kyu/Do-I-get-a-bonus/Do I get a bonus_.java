public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    int salariofinal=0;
   if(bonus==true){
     salariofinal=salary*10;
   }else{
     salariofinal=salary;
   }
  return String.valueOf("£"+salariofinal);
    }
}
