public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
      int resultado=(s1+s2+s3)/3;
    if(resultado>=90 && resultado<=100){
        return 'A';
    }else if(resultado>=80 && resultado<90){
        return 'B';
    }else if(resultado>=70 && resultado<80){
        return 'C';
    }else if(resultado>=60 && resultado<70){
        return 'D';
    }else{
      return 'F';
    }
  }
}
