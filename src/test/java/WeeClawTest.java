import Items.Weapons.WeeClaw;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeeClawTest {

    WeeClaw weeClaw;

    @Before
    public void before() {
        weeClaw = new WeeClaw("Wee Claw", 5, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Wee Claw", weeClaw.getName());
    }

    @Test
    public void canGetAttackPoints() {
        assertEquals(5, weeClaw.getAttackPoints());
    }

    @Test
    public void canGetHealPoints() {
        assertEquals(0, weeClaw.getHealPoints());
    }
}
