public class TotalPoints {
  
    public static int points(String[] games) {
      int points=0;
        for(int i=0;i<10;i++){
          
          if(games[i].charAt(0)>games[i].charAt(2)){
            points=points+3;
          }else if(games[i].charAt(0)==games[i].charAt(2)){
            points=points+1;
          }else{
            points=points+0;
          }
        }
      return points;
    }
}
