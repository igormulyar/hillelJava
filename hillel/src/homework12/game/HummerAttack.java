package homework12.game;


/**
 * Created by TRUST on 30.10.2015.
 */
public class HummerAttack implements AttackBehavior {

    Damage damage = new SplittingDamage();

    @Override
    public int attack(Character character) {
        if (character instanceof Orc){
        return damage.getDamage() + character.getDamageBonus();
        } else{
            return damage.getDamage() + character.getDamageBonus()/2;
        }
    }
}
