package homeWork11.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Orc extends Person  {

    public Orc() {
        attackBehavior = new HummerAttack();
    }

    @Override
    public String attack() {
        return attackBehavior.attack();
    }
}
