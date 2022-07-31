public class GhostCode{
  public static String helloName(String name){

    if(name == null || name.equals("")){
      return "Hello world!";
    }else{
      System.out.print(name);
      return "Hello my name is " + name;
      }
    
  }
}
