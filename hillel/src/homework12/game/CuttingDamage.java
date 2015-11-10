package homework12.game;

import java.util.Random;

/**
 * Created by igor on 10.11.15.
 */
public class CuttingDamage implements Damage {
    @Override
    public int getDamage() {
        Random rand = new Random();
        return rand.nextInt(4)+6;
    }
}
