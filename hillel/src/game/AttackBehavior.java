package game;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by TRUST on 30.10.2015.
 */
public abstract class AttackBehavior {

    protected Damage damage;
    private Damage bonus;


    /**
     * @param character is a type of character who attacks
     * @return value of damage caused by particular weapon and depending on character type
     */
    public int attack(Character character){
        bonus = character.returnDamageBonus();
        int [] damages = new int[3];
        damages[0] =bonus.getCuttingDamage() + damage.getCuttingDamage();
        damages[1] = bonus.getSplittingDamage() + damage.getSplittingDamage();
        damages[2] = bonus.getLancinatingDamage() + damage.getLancinatingDamage();
        Arrays.sort(damages);

        return damages[2] + damages[1]/2;
    }

}
