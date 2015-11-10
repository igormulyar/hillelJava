package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class GameMain {
    public static void main(String[] args) {

        System.out.println("Attack with default Weapons:");
        Character character = new Human();
        System.out.println(character.attack());

        character = new Elf();
        System.out.println(character.attack());

        character = new Orc();
        System.out.println(character.attack());

        System.out.println("\nAnd now..." +
                "Attack with other weapons:");

        System.out.println("Elf attacks with orc's Hummer:");
        character = new Elf();
        character.setWeapon(new HummerAttack());
        System.out.println(character.attack());

        System.out.println("\nHuman attacks with Bow:");
        character = new Human();
        character.setWeapon(new BowAttack());
        System.out.println(character.attack());
    }
}

       /*
        OUT:
        Attack with default Weapons:
        Human attacked. Damage is : 10
        Elf attacked. Damage is: 12
        Orc attacked. Damage is: 9

        And now...Attack with other weapons:
        Elf attacks with orc's Hummer:
        Elf attacked. Damage is: 10

        Human attacks with Bow:
        Human attacked. Damage is : 7*/