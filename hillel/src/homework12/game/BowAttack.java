package homework12.game;


/**
 * Created by TRUST on 30.10.2015.
 */
public class BowAttack implements AttackBehavior {

    Damage damage = new LancinatingDamage();

    @Override
    public int attack(Character character) {
        if (character instanceof Elf){
        return damage.getDamage()+character.getDamageBonus();
        } else{
            return damage.getDamage() + character.getDamageBonus()/2;
        }
    }

    @Override
    public String toString() {
        return "Bow ";
    }
}
