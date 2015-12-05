package game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Human extends Character {

    private final Damage damageBonus = new Damage(3,0,0);

    public Human() {
        attackBehavior = new SwordAttack();
    }

    @Override
    public int attack() {
        return attackBehavior.attack(this);
    }

    @Override
    public Damage returnDamageBonus() {
        return damageBonus;
    }


    @Override
    public String toString(){
        return "Human "+attackBehavior.toString();
    }

}
