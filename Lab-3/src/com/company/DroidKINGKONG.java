package com.company;

public class DroidKINGKONG extends Droid {
    public DroidKINGKONG() {
        super.setTypeOfDroid("KINGKONG");
    }

    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.setProtection(this.getProtection()+40);
    }
}

















