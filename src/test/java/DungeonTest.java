import Items.Items;
import Items.Weapons.BigClaw;
import Items.Weapons.WeeClaw;
import Players.Enemies.Monster;
import Rooms.Dungeon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;

    BigClaw bigClaw;
    WeeClaw weeClaw;
    Monster monster1;
    ArrayList<Items> roomContents;

    @Before
    public void before(){
        bigClaw = new BigClaw("Big Claw", 40, 0);
        weeClaw = new WeeClaw("Wee Claw", 10, 0);

        monster1 = new Monster("Hairy McClairy", 50, bigClaw, weeClaw);
        dungeon = new Dungeon("Combat Hall", roomContents);
    }

    @Test
    public void canGetName() {
        assertEquals("Combat Hall", dungeon.getName());
    }



}
