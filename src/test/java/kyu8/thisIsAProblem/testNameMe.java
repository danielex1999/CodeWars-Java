package kyu8.thisIsAProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class testNameMe {
    @Test
    public void testNameMeOne() {
        NameMe nameMe = new NameMe("John", "Doe");

        assertEquals("John", nameMe.getFirstName());

        assertEquals("Doe", nameMe.getLastName());

        assertNotEquals("JohnDoe", nameMe.getFullName());

        assertEquals("John Doe", nameMe.getFullName());
    }
}