package com.company;

public class WeaponShield extends Weapon {
    public WeaponShield() {
        super.setTypeOfWeapon("Shield");
    }

    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.setProtection(attack.getProtection() + 20);
    }
}

