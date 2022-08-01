public class Kata{
  public static double fuelPrice(int litres, double pricePerLitre) {
      if(litres >= 10){
        pricePerLitre=pricePerLitre-0.25;
      }else if(litres >= 8){
        pricePerLitre=pricePerLitre-0.20;
      }else if(litres >= 6){
        pricePerLitre=pricePerLitre-0.15;
      }else if(litres >= 4){
        pricePerLitre=pricePerLitre-0.10;
      }else if(litres >= 2){
        pricePerLitre=pricePerLitre-0.05;
      }
    return litres*pricePerLitre;
  }
}

