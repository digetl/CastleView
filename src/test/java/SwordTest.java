import Items.Weapons.Sword;
import Players.Heroes.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword1;

    @Before
    public void before() {
        sword1 = new Sword("Stabby McStabby", 20, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Stabby McStabby", sword1.getName());
    }

    @Test
    public void canGetAttackPoints() {
        assertEquals(20, sword1.getAttackPoints());
    }

    @Test
    public void canGetHealPoints() {
        assertEquals(0, sword1.getHealPoints());
    }

}
