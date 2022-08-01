public class Bob {
  public static int enough(int cap, int on, int wait){
    System.out.println(cap+" "+on+" "+wait);
    if(on+wait<=cap){
      return 0;
     }else{
      return wait+on-cap;
    }
  }
}
