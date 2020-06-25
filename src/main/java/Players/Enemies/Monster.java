package Players.Enemies;

import Items.Weapons.Weapons;
import Players.Enemy;

public class Monster extends Enemy {

    public Monster(String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        super(name, healthPoints, primaryWeapon, secondaryWeapon);
    }
}
