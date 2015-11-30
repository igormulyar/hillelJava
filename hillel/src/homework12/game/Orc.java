package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Orc extends Character {

    private final Damage damageBonus = new Damage (0,2,0);

    public Orc() {
        attackBehavior = new HummerAttack();
    }

    @Override
    public String attack() {
        return "Orc attacked. Damage is: " + attackBehavior.attack(new Orc());
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
