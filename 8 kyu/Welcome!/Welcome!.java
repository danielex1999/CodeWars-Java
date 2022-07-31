import java.util.*;
public class Welcome {
public static String greet(String language){
   //https://www.w3schools.com/java/java_hashmap.asp
   HashMap<String, String> db = new HashMap<>();
   db.put("english", "Welcome");
   db.put("czech", "Vitejte");
   db.put("danish", "Velkomst");
   db.put("dutch", "Welkom");
   db.put("estonian", "Tere tulemast");
   db.put("finnish", "Tervetuloa");
   db.put("flemish", "Welgekomen");
   db.put("french", "Bienvenue");
   db.put("german", "Willkommen");
   db.put("irish", "Failte");
   db.put("italian", "Benvenuto");
   db.put("latvian", "Gaidits");
   db.put("lithuanian", "Laukiamas");
   db.put("polish", "Witamy");
   db.put("spanish", "Bienvenido");
   db.put("swedish", "Valkommen");
   db.put("welsh", "Croeso");
   return db.containsKey(language) ? db.get(language): db.get("english");
   }
}
