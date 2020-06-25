package Players;

import Items.Weapons.Weapons;

public class Enemy extends Player{

    public Enemy(String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        super(name, healthPoints, primaryWeapon, secondaryWeapon);
    }

}
