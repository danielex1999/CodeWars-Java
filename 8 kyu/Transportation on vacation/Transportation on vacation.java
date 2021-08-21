public class Kata {
  public static int rentalCarCost(int d) {
    int costo=0;
    if(d>=7){
      costo=(d*40)-50;
    }else if(d>=3){
      costo=(d*40)-20;
    }else{
      costo=d*40;
    }
    return costo;
  }
}
