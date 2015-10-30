package homeWork11.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Human extends Person{

    public Human() {
        attackBehavior = new SwordAttack();
    }

    @Override
    public String attack() {
        return attackBehavior.attack();
    }
}
