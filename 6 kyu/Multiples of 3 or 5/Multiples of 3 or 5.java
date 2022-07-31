public class Solution {
  public int solution(int number) {
    int result=0;
    for(int i=0;i<number;i++){
    System.out.println(i);
      if(i%3 == 0 || i%5 == 0){
        result = i + result;
      }else{
        result=result;
      }
    }
    return result;
  }
}
