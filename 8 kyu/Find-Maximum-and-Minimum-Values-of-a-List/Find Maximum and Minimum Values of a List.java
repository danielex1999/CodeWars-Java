public class Kata {

  public int min(int[] list) {
    int menorvalor=1;
    for(int i=0; i<list.length;i++){
      if(list[i]< menorvalor){
        menorvalor=list[i];
      }
    }
    return menorvalor;
  }
  
  public int max(int[] list) {
  int mayorvalor=0;
    for(int i=0; i<list.length;i++){
      if(list[i]> mayorvalor){
        mayorvalor=list[i];
      }
    }
    return mayorvalor;
  }
}
