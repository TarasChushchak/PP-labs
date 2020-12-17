package com.company;

public class DroidSniper extends Droid {
    public DroidSniper() {
        super.setTypeOfDroid("Sniper");
    }

    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.makeHit(defend);
        this.setProtection(this.getProtection()+15);
        this.setHealth(defend.getHealth()-25);
    }
}

