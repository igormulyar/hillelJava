package homeWork11.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Elf extends Person {

    public Elf() {
        attackBehavior = new BowAttack();
    }

    @Override
    public String attack() {
        return attackBehavior.attack();
    }
}
