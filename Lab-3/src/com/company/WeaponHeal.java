package com.company;

public class WeaponHeal extends Weapon {
    public WeaponHeal() {
        super.setTypeOfWeapon("Heal");
    }

    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.setHealth(attack.getHealth() + 15);
    }
}

