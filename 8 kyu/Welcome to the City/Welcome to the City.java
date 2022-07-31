public class Hello{
  public String sayHello(String [] name, String city, String state){
    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0;i<name.length;i++){
      if(i==name.length-1){
        stringBuilder.append(name[i]);
        
      }else{
        stringBuilder.append(name[i]+ " ");
       
      }
    }
    return "Hello, "+stringBuilder.toString()+"! Welcome to "+city+", "+state+"!";
    
  }
}
