package game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Human extends Character {


    public Human() {
        attackBehavior = new SwordAttack();
        damageBonus = new Damage(3,0,0);
    }

    @Override
    public String toString(){
        return "Human "+attackBehavior.toString();
    }

}
