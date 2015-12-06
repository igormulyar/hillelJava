package game;

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
        return "Orc "+attackBehavior.toString();
    }
}
