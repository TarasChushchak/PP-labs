package com.company;

public class DroidMedic extends Droid {
    public DroidMedic() {
        super.setTypeOfDroid("Medic");
    }

    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.setHealth(defend.getHealth()+40);
    }
}

