package homework12.game;


/**
 * Created by TRUST on 30.10.2015.
 */
public class BowAttack implements AttackBehavior {

    Damage damage = new LancinatingDamage();

    @Override
    public int attack() {
        return damage.getDamage();
    }
}
