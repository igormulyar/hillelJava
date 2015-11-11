package homework12.game;

import homework12.game.Damage;

import java.util.Random;

/**
 * Created by TRUST on 10.11.2015.
 */
public class CuttingDamage implements Damage {

    @Override
    public int getDamage() {
        Random rand = new Random();
        return rand.nextInt(4)+6;
    }
}
