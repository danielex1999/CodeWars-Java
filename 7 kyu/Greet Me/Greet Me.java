public class GreetMe{
  public static String greet(String name){
    int total=name.length();
    String edit=name.toLowerCase().substring(1,total);
    return "Hello " + name.toUpperCase().charAt(0)+edit+"!";
  }
}
