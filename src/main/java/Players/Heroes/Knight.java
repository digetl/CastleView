package Players.Heroes;

import Items.Weapons.Weapons;
import Players.Player;

public class Knight extends Fighter{

    private int shield;
    public Knight(String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        super(name, healthPoints, primaryWeapon, secondaryWeapon);
    }

    public int equipShield(Player player){
       return setHealthPoints(100);
    }

}
