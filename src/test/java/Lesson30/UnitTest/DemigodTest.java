package Lesson30.UnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemigodTest {

    // Eksampel: assertEquals
    // Test af, om getName() returnerer præcis det navn, vi forventer.
    // assertEquals bruges til at sammenligne to værdier: forventet vs. faktisk.
    @Test
    void testGetName() {
        Demigod percy = new Demigod("Percy", "Poseidon", 16);
        // Vi forventer navnet "Percy", og assertEquals tjekker det.
        assertEquals("Percy", percy.getName());
    }

    // Eksampel: assertTrue
    // Test af, om isEligibleForQuest() returnerer true, når alder ≥ 12.
    // assertTrue tjekker, at den givne betingelse er sand.
    @Test
    void testIsEligibleForQuest_True() {
        Demigod annabeth = new Demigod("Annabeth", "Athena", 14);
        // Annabeth er 14 år, så hun skal være berettiget til quest → true
        assertTrue(annabeth.isEligibleForQuest());
    }

    // Eksampel:  assertFalse
    // Test af, om isEligibleForQuest() returnerer false, når alder < 12.
    // assertFalse tjekker, at den givne betingelse er falsk.
    @Test
    void testIsEligibleForQuest_False() {
        Demigod nico = new Demigod("Nico", "Hades", 10);
        // Nico er kun 10 år, så han er for ung → false
        assertFalse(nico.isEligibleForQuest());
    }

    // Eksampel:  assertThrows
    // Test af, om constructoren kaster en fejl, når alderen er negativ.
    // assertThrows bruges til at tjekke, at koden kaster den forventede exception.
    @Test
    void testNegativeAgeThrowsException() {
        // Vi forventer, at IllegalArgumentException kastes
        assertThrows(IllegalArgumentException.class, () -> {
            new Demigod("Percy", "Poseidon", -1);
        });
    }

    //Eksampel: assertNotNull
    // Test af, om getGodParent() returnerer et objekt, der ikke er null.
    // assertNotNull tjekker, at objektet eksisterer.
    @Test
    void testGodParentNotNull() {
        Demigod percy = new Demigod("Percy", "Poseidon", 16);
        // Gudeforælder skal altid være sat → ikke null
        assertNotNull(percy.getGodParent());
    }
}
