package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Elf extends Character {

    private int damageBonus = 4;

    public Elf() {
        attackBehavior = new BowAttack();
    }

    @Override
    public String attack() {


        return "Elf attacked. Damage is: " + (attackBehavior.attack() + damageBonus/2);
    }
}
