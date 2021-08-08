import java.util.Arrays;

public class PythagoreanTriple {
  public int pythagoreanTriple(int[] triple){
    if(triple[0]*triple[0]+triple[1]*triple[1]==(triple[2]*triple[2])){
      return 1;
    }else{
      return 0;
    }
  }
}
