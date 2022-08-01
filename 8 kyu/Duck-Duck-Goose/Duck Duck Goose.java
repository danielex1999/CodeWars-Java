public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    int result=goose%players.length;
    return result ==0?
      players[players.length-1].name:players[result-1].name;
  }
}
