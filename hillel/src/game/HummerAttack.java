package game;

import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public class HummerAttack extends AttackBehavior {


    public HummerAttack() {
        damage = new Damage (0,0, new Random().nextInt(2)+7);
    }

    @Override
    public String toString() {
        return "Hummer ";
    }
}
