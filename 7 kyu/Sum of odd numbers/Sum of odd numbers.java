class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
      int result=n*(n-1)-1;
      int total=0;
      if(n ==1){
        return 1;
      }
        for(int i=0;i<n;i++){
          System.out.println(result);
          result=result+2;
          total=result+total;
        }
        return total;
    }
}
