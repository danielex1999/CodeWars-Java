public class Kata {
  public static String rps(String p1, String p2) {
    if((p1=="rock" && p2=="scissors") || (p1=="scissors" && p2=="paper")|| (p1=="paper" && p2=="rock")) {
      return "Player 1 won!";
    }else if(p1==p2){
      return "Draw!";
    }else{
      return "Player 2 won!";
    }
  }
}
