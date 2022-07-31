public class TrafficLights {

  public static String updateLight(String current) {
    String result="";
    if(current=="red")
      result= "green";
    
    if(current=="green")
      result= "yellow";
    
    if(current=="yellow")
      result= "red";
    
    return result;
  }
  
}
