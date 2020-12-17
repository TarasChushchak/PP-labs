package com.company;

public class DroidBerserk extends Droid {

    public DroidBerserk() {
        super.setTypeOfDroid("Berserk");
    }

    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.makeHit(defend);
    }
}

