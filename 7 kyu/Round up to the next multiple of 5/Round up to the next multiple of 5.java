package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
        double multiplo = 1;
        multiplo = (number / 5.0);

        return (int) (Math.ceil(multiplo) * 5);
    }
}
