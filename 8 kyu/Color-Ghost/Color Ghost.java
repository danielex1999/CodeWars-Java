import java.util.Random;
public class Ghost {
    String color;
    String[] colors = {"white", "yellow", "purple", "red"};
  
      public String getColor() {
        return color;
    }
   public Ghost() {
        color = colors[new Random().ints(0, 4).findFirst().getAsInt()];
    }
}
