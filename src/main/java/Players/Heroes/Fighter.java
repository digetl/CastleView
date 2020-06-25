package Players.Heroes;

import Items.Weapons.Weapons;
import Players.Hero;

public abstract class Fighter extends Hero {

    public Fighter(String name, int healthPoints, Weapons primaryWeapon, Weapons secondaryWeapon){
        super(name, healthPoints, primaryWeapon, secondaryWeapon);
    }
}
