class Arge {
    
    public static int nbYear(double p0, double percent, int aug, int p) {
      double habitants=0; int result=0;
        while(habitants < p){
          habitants=p0+(p0*(percent/100))+aug;
          p0=habitants;
          result++;
        }
      return result;
    }
}
