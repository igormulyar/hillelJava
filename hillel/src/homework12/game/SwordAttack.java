package homework12.game;

import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public class SwordAttack implements AttackBehavior {

    Damage damage = new CuttingDamage();

    @Override
    public int attack(Character character) {
        if (character instanceof Human) {
            return damage.getDamage() + character.getDamageBonus();
        } else {
            return damage.getDamage() + character.getDamageBonus() / 2;
        }
    }

}
