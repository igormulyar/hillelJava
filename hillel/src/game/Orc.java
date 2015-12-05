package game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Orc extends Character {

    private final Damage damageBonus = new Damage (0,2,0);

    public Orc() {
        attackBehavior = new HummerAttack();
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
        return "Orc "+attackBehavior.toString();
    }
}
