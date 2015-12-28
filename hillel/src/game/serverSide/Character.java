package game.serverSide;

import java.util.Arrays;

/**
 * Created by TRUST on 30.10.2015.
 */
public abstract class Character {

    protected AttackBehavior attackBehavior;
    protected Damage damageBonus;
    private int health = 100;
    private Character enemy;

    public boolean isAlive(){
        return health >0;
    }

    public void attacked(int incomingDamage){
        health -= incomingDamage;
    }

    // enemy
    public void setEnemy (Character enemy){
        this.enemy = enemy;
    }

    public boolean hasEnemy (){
        return this.enemy != null;
    }

    public Character getEnemy (){
        return  this.enemy;
    }



    /**
     *
     * @return int value of damage
     */
    public  int attack(){
        Damage damage = attackBehavior.attack();

        int [] damages = new int[3];
        damages[0] =damageBonus.getCuttingDamage() + damage.getCuttingDamage();
        damages[1] = damageBonus.getSplittingDamage() + damage.getSplittingDamage();
        damages[2] = damageBonus.getLancinatingDamage() + damage.getLancinatingDamage();
        Arrays.sort(damages);

        return damages[2] + damages[1]/2;
    }

    /**
     *
     * @param attackBehavior defines the weapon and attack behavior
     */
    public void setWeapon(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
