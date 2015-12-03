package homework12.game;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public class BowAttack implements AttackBehavior {
    private Damage damage = new Damage (0,0, new Random().nextInt(6)+5);
    private Damage bonus = null;


    @Override
    public int attack(Character character) {
        bonus = character.returnDamageBonus();
        int [] damages = new int[3];
        damages[0] =bonus.getCuttingDamage() + damage.getCuttingDamage();
        damages[1] = bonus.getSplittingDamage() + damage.getSplittingDamage();
        damages[2] = bonus.getLancinatingDamage() + damage.getLancinatingDamage();
        Arrays.sort(damages);

        return damages[2] + damages[1]/2;
    }

    @Override
    public String toString() {
        return "Bow ";
    }
}
