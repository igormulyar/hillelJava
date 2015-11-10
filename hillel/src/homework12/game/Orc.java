package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Orc extends Character {

    public Orc() {
        attackBehavior = new HummerAttack();
    }

    @Override
    public String attack() {
        return "Orc attacked. Damage is: " + attackBehavior.attack();
    }
}
