public class ZywOo {

  public static String warnTheSheep(String[] array) {
    int wolf = 0;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == "wolf") {
        wolf = i;
      }     
    }
    
    if (wolf == (array.length-1)) {
      return "Pls go away and stop eating my sheep";
    } else {
      return "Oi! Sheep number " + (array.length-wolf-1) + "! You are about to be eaten by a wolf!";
    }

  }

}
