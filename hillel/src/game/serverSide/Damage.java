package game.serverSide;

import java.io.Serializable;

/**
 * Created by TRUST on 10.11.2015.
 */
public  class Damage implements Serializable {
    private int cuttingDamage;
    private int splittingDamage;
    private int lancinatingDamage;

    protected Damage(int cuttingDamage, int splittingDamage, int lancinatingDamage) {
        this.cuttingDamage = cuttingDamage;
        this.splittingDamage = splittingDamage;
        this.lancinatingDamage = lancinatingDamage;
    }

    public int getCuttingDamage() {
        return cuttingDamage;
    }

    public int getSplittingDamage() {
        return splittingDamage;
    }

    public int getLancinatingDamage() {
        return lancinatingDamage;
    }
}
