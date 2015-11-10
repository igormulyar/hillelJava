package homework12.game;

import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public class SwordAttack implements AttackBehavior {

    Damage damage = new CuttingDamage();

    @Override
    public int attack() {
        return damage.getDamage();
    }


}
