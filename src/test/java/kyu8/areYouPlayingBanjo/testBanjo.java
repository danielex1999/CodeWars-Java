package kyu8.areYouPlayingBanjo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBanjo {
@Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"));
        assertEquals( "bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"));
    }
}
