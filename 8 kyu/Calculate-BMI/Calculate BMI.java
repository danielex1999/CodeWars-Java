public class Calculate {
  public static String bmi(double weight, double height) {
    double bmi=(weight/(height*height));
    String result;
    if(bmi <= 18.5){
      result="Underweight";
    }else if(bmi > 18.5 && bmi <= 25.0){
      result="Normal";
    }else if(bmi > 25.0 && bmi <= 30.0){
      result="Overweight";
    }else{
      result="Obese";
    }
    return result;
  }
}
