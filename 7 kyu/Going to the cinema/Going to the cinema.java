public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
    int result = 0;
    double tarjeta = card;
    while (ticket * result <= Math.ceil(tarjeta)) {
      tarjeta= (ticket * Math.pow(perc, ++result))+tarjeta;
    }
    return result;
  }
}
