package Players;

import Behaviours.Attackable;
import Items.Items;
import Items.Weapons.Weapons;

import java.util.ArrayList;

public abstract class Player implements Attackable {
    private String name;
    private int healthPoints;
    private ArrayList<Items> inventory;
    private Weapons primaryWeapon;
    private Weapons secondaryWeapon;

    public Player (String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        this.name = name;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<Items>();
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
    }

    public String getName(){
        return name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public int setHealthPoints(int points){
        return healthPoints += points;
    }

    public Weapons getPrimaryWeapon(){
        return primaryWeapon;
    }

    public Weapons getSecondaryWeapon(){
        return secondaryWeapon;
    }

    public int attacked(Player player, Items weapon) {
       player.healthPoints -= weapon.getAttackPoints();
        if(player.healthPoints < 0) {
         return player.healthPoints = 0;
        }
        else return player.healthPoints;

    }

}
