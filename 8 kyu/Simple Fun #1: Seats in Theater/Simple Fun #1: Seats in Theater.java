public class Kata {

  public static int seatsInTheater(int nCols, int nRows, int col, int row) {
      if(nCols==nRows && col==row && nCols==col){
        return 0;
      }else{
        return (nCols-col+1)*(nRows-row);
      }
  }
}
