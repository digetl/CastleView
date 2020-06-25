package Players;

import Items.Items;
import Items.Weapons.Weapons;

import java.util.ArrayList;

public abstract class Player {
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
}
