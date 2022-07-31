public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    name = name.toUpperCase(); 
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}
