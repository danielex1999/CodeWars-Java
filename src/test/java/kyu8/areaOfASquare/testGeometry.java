package kyu8.areaOfASquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testGeometry {
    private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        assertEquals(1.62, Geometry.squareArea(2),DELTA);
        assertEquals(0, Geometry.squareArea(0),DELTA);
        assertEquals(80, Geometry.squareArea(14.05),DELTA);
    }
}
