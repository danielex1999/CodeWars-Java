class Kata {
    static String greet(String name, String owner) {
        if(name.equals(owner)){
          return "Hello boss";
        }else{
          return  "Hello guest";
        }
    }
}
