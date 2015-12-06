package game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Elf extends Character {


    public Elf() {
        attackBehavior = new BowAttack();
        damageBonus = new Damage (0,0,4);
    }

    @Override
    public String toString(){
        return "The Character is Elf. The weapon is "+attackBehavior.toString();
    }

}
