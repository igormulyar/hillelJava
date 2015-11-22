package homework12.game;

import java.io.IOException;

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
        System.out.println();


        //HW 14:
        //save
        IOSaveAndRecover.saveCharacter(character, "/home/igor/workspace/save_HumanWithBow");
        character = new Elf();
        character.setWeapon(new SwordAttack());
        IOSaveAndRecover.saveCharacter(character, "/home/igor/workspace/save_ElfWithSword");

        // recover
        try {
            character = IOSaveAndRecover.recoverCharacter("/home/igor/workspace/save_ElfWithSword"); // recover elf with sword
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Recovered Object: "+character);

        try {
            character = IOSaveAndRecover.recoverCharacter("/home/igor/workspace/save_HumanWithBow");  // recover human with bow
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Recovered Object: "+character);
    }
}

       /*
        OUT:

        Attack with default Weapons:
        Human attacked. Damage is : 11
        Elf attacked. Damage is: 14
        Orc attacked. Damage is: 10

        And now...Attack with other weapons:
        Elf attacks with orc's Hummer:
        Elf attacked. Damage is: 10

        Human attacks with Bow:
        Human attacked. Damage is : 7

        Recovered Object: Elf Sword
        Recovered Object: Human Bow

        Process finished with exit code 0

        */