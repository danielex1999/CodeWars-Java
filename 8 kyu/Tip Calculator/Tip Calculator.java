public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {

    String rate = rating.toLowerCase();
    System.out.println(rate+" "+amount);
    switch(rate){
        case "terrible":
          return (int) Math.ceil(amount*0/100);
          
        
        case "poor":
          return (int) Math.ceil(amount*5/100);
          
        
        case "good":
          return (int) Math.ceil(amount*10/100);
          
        
        case "great":
          return (int) Math.ceil(amount*15/100);
          
        
        case "excellent":
          return (int) Math.ceil(amount*20/100);
          
        
        default:
          return null;
          
     }
    }
  }
