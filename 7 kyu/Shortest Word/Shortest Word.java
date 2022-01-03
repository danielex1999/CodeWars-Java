public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int result=10;
        for(int i=0;i<words.length;i++){
            if(words[i].length() <= result){
                result= words[i].length();
            }
        }
        return result;
    }
}
