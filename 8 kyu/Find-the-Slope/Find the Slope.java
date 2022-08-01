public class Slope{

  public String slope(int[] points){
  int y=points[3]-points[1];
  int x=points[2]-points[0];
  if(x==0){
    return "undefined";
  }else{
    return String.valueOf(y/x);
  }
  }
}
