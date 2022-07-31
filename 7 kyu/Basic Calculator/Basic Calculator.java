public class Calculator{
  public static Double calculate(final double numberOne, final String operation, final double numberTwo){
        if(operation=="+"){
          return numberOne+numberTwo;
        }else if(operation=="-"){
          return numberOne-numberTwo;
        }else if(operation=="*"){
          return numberOne*numberTwo+0.0;
        }else if(operation=="/"){
          if(numberOne/numberTwo < 0){
            return null;
          }else{
          return numberOne/numberTwo;
          }
        }else{
          return null;
        }
  }
}
