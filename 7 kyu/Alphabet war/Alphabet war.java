public class Kata{
    public static String alphabetWar(String fight){
      int left=0,right = 0;
      int size=fight.length();
      
      for(int i=0;i<size;i++){
        if(fight.charAt(i)=='z'){
          right+=1;
        }
        if(fight.charAt(i)=='d'){
          right+=2;
        }
        if(fight.charAt(i)=='q'){
          right+=3;
        }
        if(fight.charAt(i)=='m'){
          right+=4;
        }
        if(fight.charAt(i)=='s'){
          left+=1;
        }
        if(fight.charAt(i)=='b'){
          left+=2;
        }
        if(fight.charAt(i)=='p'){
          left+=3;
        }
        if(fight.charAt(i)=='w'){
          left+=4;
        }
      }
      
      if(left>right){
        return "Left side wins!";
      }else if(right>left){
        return "Right side wins!";
      }else{
        return "Let's fight again!";
      }
    }
}
