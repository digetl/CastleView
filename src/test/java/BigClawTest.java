import Items.Weapons.BigClaw;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigClawTest {

    BigClaw bigClaw;

    @Before
    public void before() {
        bigClaw = new BigClaw("Big Claw", 40, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Big Claw", bigClaw.getName());
    }

    @Test
    public void canGetAttackPoints() {
        assertEquals(40, bigClaw.getAttackPoints());
    }

    @Test
    public void canGetHealPoints() {
        assertEquals(0, bigClaw.getHealPoints());
    }
}
