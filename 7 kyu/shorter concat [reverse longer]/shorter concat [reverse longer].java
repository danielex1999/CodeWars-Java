public class ReverseLonger {

  public static String shorterReverseLonger(String a, String b) {
  StringBuilder reversa =new StringBuilder(); 
  String result="";
  if(a.length()<b.length()){
    reversa.append(b);
    reversa.reverse();
    result=a+reversa.toString()+a;
  }else{
    reversa.append(a);
    reversa.reverse();
    result=b+reversa.toString()+b;
  }
    return result;
  }
}
