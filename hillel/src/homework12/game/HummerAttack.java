package homework12.game;


/**
 * Created by TRUST on 30.10.2015.
 */
public class HummerAttack implements AttackBehavior {

    Damage damage = new SplittingDamage();

    @Override
    public int attack() {
        return damage.getDamage();
    }
}
