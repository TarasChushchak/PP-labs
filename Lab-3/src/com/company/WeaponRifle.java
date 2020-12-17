package com.company;

public class WeaponRifle extends Weapon {
    public WeaponRifle() {
        super.setTypeOfWeapon("Rifle");
    }

    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.makeHit(defend);
    }
}
