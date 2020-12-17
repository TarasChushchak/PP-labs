package com.company;

public class WeaponSword extends Weapon {
    public WeaponSword() {
        super.setTypeOfWeapon("Sword");
    }

    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.makeHit(defend);
    }
}
