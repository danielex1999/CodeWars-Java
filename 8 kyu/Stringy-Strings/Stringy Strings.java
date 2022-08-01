public class Kata {
  public static String stringy(int size) {
    String resultado="";
for(int i=0;i<size;i++){
  if(i % 2 == 0){
    resultado=resultado+"1";
  }else{
    resultado=resultado+"0";
  }
}
  return  resultado;
  }
}
