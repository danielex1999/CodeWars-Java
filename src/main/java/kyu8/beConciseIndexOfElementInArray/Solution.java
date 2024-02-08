package kyu8.beConciseIndexOfElementInArray;

public class Solution {
    public static String kata(String[] a, String b) {
        int i = 0;
        for (String s : a) {
            if (s.equals(b)) return "" + i;
            i++;
        }
        return "Not found";
    }
}