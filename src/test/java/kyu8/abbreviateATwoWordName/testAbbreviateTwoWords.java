package kyu8.abbreviateATwoWordName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAbbreviateTwoWords {
    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }
}
