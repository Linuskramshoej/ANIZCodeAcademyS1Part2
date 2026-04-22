package Lesson30.UnitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DemigodTest {
    @Test
    public void testGetName(){
        Demigod demigod = new Demigod("Hercules","Zeus",28);
        assertEquals( demigod.getName() , "Hercules");
    }

    @Test
    public void testGetGodParent(){
        Demigod demigod = new Demigod("Hercules","Zeus",28);
        assertEquals( demigod.getGodParent() , "Zeus");
    }

    @Test
    public void testGetAge(){
        Demigod demigod = new Demigod("Hercules","Zeus",28);
        assertEquals( demigod.getAge() , 28);
    }

    @Test
    public void oldEnoughForQuest(){
        Demigod demigod = new Demigod("Hercules","Zeus",28);
        assertTrue(demigod.isEligibleForQuest());
    }

    @Test
    public void tooYoungForQuest(){
        Demigod demigod = new Demigod("Hercules","Zeus",10);
        assertFalse(demigod.isEligibleForQuest());
    }

    @Test
    public void getCampCabinTest1(){
        Demigod demigod = new Demigod("Hercules","Zeus",28);
        assertEquals(demigod.getCampCabin(),"Cabin 1");
    }

    @Test
    public void getCampCabinTest2(){
        Demigod demigod = new Demigod("Hercules","Poseidon",28);
        assertEquals(demigod.getCampCabin(),"Cabin 3");
    }

    @Test
    public void getCampCabinTest3(){
        Demigod demigod = new Demigod("Hercules","Athena",28);
        assertEquals(demigod.getCampCabin(),"Cabin 6");
    }

    @Test
    public void getCampCabinTest4(){
        Demigod demigod = new Demigod("Hercules","1fijsa",28);
        assertEquals(demigod.getCampCabin(),"Unknown Cabin");
    }
}