package kyu8.basicSubclassesAdamAndEve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testGod {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals(true, paradise[0] instanceof Man, "Adam is a man");
    }
}
