import Items.Weapons.Sword;
import Players.Heroes.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KnightTest {
    
    Knight knight1;
    Sword sword1;
    Sword sword2;

    @Before
    public void before() {
        sword1 = new Sword("Stabby McStabby", 20, 0);
        sword2 = new Sword("Butterknife", 5, 0);

        knight1 = new Knight("Sir Bob",100, sword1, sword2);
    }

    @Test
    public void canGetKnightName() {
        assertEquals("Sir Bob", knight1.getName());
    }


    @Test
    public void canGetHealthPoints(){
    assertEquals(100, knight1.getHealthPoints());
    }

    @Test
    public void canGetPrimaryWeapon(){
    assertEquals(sword1, knight1.getPrimaryWeapon());
    }

    @Test
    public void canGetSecondaryWeapon(){
        assertEquals(sword2, knight1.getSecondaryWeapon());
    }

}
