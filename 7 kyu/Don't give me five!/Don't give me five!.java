public class Kata{
    public static int dontGiveMeFive(int start, int end) {
        int contFive=0, sumTotal=end-start+1;
        while(start <= end){
            if(Integer.toString(start).contains("5")){
                contFive++;
            }
            start++;
        }
        return sumTotal-contFive;
    }
}
