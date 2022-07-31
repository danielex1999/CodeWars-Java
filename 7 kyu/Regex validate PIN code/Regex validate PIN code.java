public class Solution {

    public static boolean validatePin(String pin) {
        if(pin.matches("\\d+") && (pin.length()==4||pin.length()==6)){
            return true;
        }else{
            return false;
        }
    }
}
