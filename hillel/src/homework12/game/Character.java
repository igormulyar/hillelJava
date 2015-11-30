package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public abstract class Character {

    protected AttackBehavior attackBehavior;

    /**
     *
     * @return message about attack action
     */
    public abstract String attack();

    public abstract Damage returnDamageBonus();

    /**
     *
     * @param attackBehavior defines the weapon and attack behavior
     */
    public void setWeapon(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
