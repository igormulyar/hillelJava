package homework12.game;

import java.util.Random;

/**
 * Created by TRUST on 10.11.2015.
 */
public class SplittingDamage implements Damage {


    @Override
    public int getDamage() {
        Random rand = new Random();
        return rand.nextInt(2)+7;
    }
}
