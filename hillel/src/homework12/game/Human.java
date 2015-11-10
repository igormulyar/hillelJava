package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Human extends Character {



    public Human() {
        attackBehavior = new SwordAttack();
    }

    @Override
    public String attack() {
        return "Human attacked. Damage is : " + attackBehavior.attack(new Human());
    }

    @Override
    public int getDamageBonus() {
        return 3;
    }
}
