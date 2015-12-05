package game;


import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public class BowAttack extends AttackBehavior {

    public BowAttack() {
        damage = new Damage (0,0, new Random().nextInt(6)+5);
    }

    @Override
    public String toString() {
        return "Bow ";
    }
}
