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
import static org.junit.Assert.assertTrue;

public class KnightTest {
    
    Knight knight1;
    Sword sword1;
    Sword sword2;

    Monster monster1;
    Monster monster2;
    BigClaw bigClaw;
    WeeClaw weeClaw;

    Dungeon dungeon;
    ArrayList<Items> roomContents;


    @Before
    public void before() {
        sword1 = new Sword("Stabby McStabby", 20, 0);
        sword2 = new Sword("Butterknife", 5, 0);

        knight1 = new Knight("Sir Bob",100, sword1, sword2);
        bigClaw = new BigClaw("Big Claw", 40, 0);
        weeClaw = new WeeClaw("Wee Claw", 10, 0);
        monster1 = new Monster("Hairy McClairy", 50, bigClaw, weeClaw);
        monster2 = new Monster("Peter Reid (fae Peterhead)", 70, bigClaw, weeClaw);


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

    @Test
    public void canAttackEnemy(){
        knight1.attacked(monster1, sword1);
        assertEquals(30, monster1.getHealthPoints());
    }

    @Test
    public void canDefeatEnemy(){
        knight1.attacked(monster1, sword1);
        knight1.attacked(monster1, sword1);
        knight1.attacked(monster1, sword1);
        assertEquals(0, monster1.getHealthPoints());
    }

    @Test
    public void canMoveToNewRoom() {
        dungeon = new Dungeon("The Grand Hall", roomContents);

        knight1.attacked(monster1, sword1);
        knight1.attacked(monster1, sword1);
        knight1.attacked(monster1, sword1);
        assertEquals(0, monster1.getHealthPoints());
        assertTrue(dungeon.moveToNewRoom(monster1));
        dungeon.addPlayerToRoom(knight1);

        dungeon.addPlayerToRoom(monster2);
        assertEquals(2, dungeon.roomPlayersCount());

    }

}
