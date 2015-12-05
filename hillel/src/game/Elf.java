package game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Elf extends Character {

    private final Damage damageBonus = new Damage (0,0,4);


    public Elf() {
        attackBehavior = new BowAttack();
    }

    @Override
    public int attack() {
        return  attackBehavior.attack(this);
    }

    @Override
    public Damage returnDamageBonus() {
        return damageBonus;
    }


    @Override
    public String toString(){
        return "Elf "+attackBehavior.toString();
    }

}
