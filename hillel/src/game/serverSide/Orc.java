package game.serverSide;

import java.lang.*;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Orc extends Character {


    public Orc() {
        attackBehavior = new HummerAttack();
        damageBonus = new Damage (0,2,0);
    }

    @Override
    public String toString(){
        return "The character is Orc. The weapon is "+attackBehavior.toString();
    }
}
