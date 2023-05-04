class Solution {
    public static boolean hero(int bullets, int dragons) {
        if ((int) (bullets / dragons) >= 2) {
            return true;
        } else {
            return false;
        }
    }
}