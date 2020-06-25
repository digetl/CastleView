import Items.Items;
import Items.Weapons.BigClaw;
import Items.Weapons.Sword;
import Items.Weapons.WeeClaw;
import Players.Enemies.Monster;
import Players.Heroes.Knight;
import Rooms.Dungeon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Sword sword1;
    Sword sword2;

    Knight knight1;

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

        sword1 = new Sword("Stabby McStabby", 20, 0);
        sword2 = new Sword("Butterknife", 5, 0);

        knight1 = new Knight("Sir Bob",100, sword1, sword2);

        dungeon = new Dungeon("Combat Hall", roomContents);

    }

    @Test
    public void canGetName() {
        assertEquals("Combat Hall", dungeon.getName());
    }

    @Test
    public void checksRoomStartsEmpty__OfContents() {
        assertEquals(0, dungeon.roomContentCount());
    }

    @Test
    public void checksRoomStartsEmpty__OfPlayers() {
        assertEquals(0, dungeon.roomPlayersCount());
    }

    @Test
    public void canAddPlayerToRoom() {
        dungeon.addPlayerToRoom(knight1);
        assertEquals(1, dungeon.roomPlayersCount());
    }

    @Test
    public void canAddItemToRoom() {
        dungeon.addItemToRoom(sword1);
        assertEquals(1, dungeon.roomContentCount());
    }


}
