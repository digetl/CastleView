package Players;

import Items.Weapons.Weapons;

public abstract class Hero extends Player{

    public Hero(String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        super(name, healthPoints, primaryWeapon, secondaryWeapon);
    }
}
