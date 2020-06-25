import Items.Weapons.BigClaw;
import Items.Weapons.WeeClaw;
import Players.Enemies.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    Monster monster1;
    BigClaw bigClaw;
    WeeClaw weeClaw;

    @Before
    public void before(){
        bigClaw = new BigClaw("Big Claw", 40, 0);
        weeClaw = new WeeClaw("Wee Claw", 10, 0);
        
        monster1 = new Monster("Hairy McClairy", 50, bigClaw, weeClaw);
    }

    @Test
    public void canGetMonsterName() {
        assertEquals("Hairy McClairy", monster1.getName());
    }


    @Test
    public void canGetHealthPoints(){
        assertEquals(50, monster1.getHealthPoints());
    }

    @Test
    public void canGetPrimaryWeapon(){
        assertEquals(bigClaw, monster1.getPrimaryWeapon());
    }

    @Test
    public void canGetSecondaryWeapon(){
        assertEquals(weeClaw, monster1.getSecondaryWeapon());
    }
    
}
