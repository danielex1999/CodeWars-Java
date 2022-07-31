public class Kata{
  public static String datingRange(int age) {
    int min=0;
    int max=0;
    if(age <14){
      min=(int)(age - 0.10 * age);
      max=(int)(age + 0.10 * age);
    }else{
      min=(int)(age/2)+7;
      max=(int)(age-7)*2;
    }
    return min+"-"+max;
  }
}
