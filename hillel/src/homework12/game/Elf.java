package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class Elf extends Character {


    public Elf() {
        attackBehavior = new BowAttack();
    }

    @Override
    public String attack() {
        return "Elf attacked. Damage is: " + attackBehavior.attack(new Elf());
    }

    @Override
    public int getDamageBonus() {
        return 4;
    }

    @Override
    public String toString(){
        return "Elf "+attackBehavior.toString();
    }

}
