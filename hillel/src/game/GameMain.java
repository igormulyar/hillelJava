package game;


import java.io.IOException;

/**
 * Created by TRUST on 30.10.2015.
 */
public class GameMain {
    public static void main(String[] args) {

        Character orc = new Orc();
        System.out.println("Orc attacked: "+orc.attack());

        Character elf = new Elf();
        System.out.println("Elf attacked: "+elf.attack());

        Character human = new Human();
        System.out.println("Human attacked: "+human.attack());

        human.setWeapon(new HummerAttack());
        System.out.println("human attacked with hummer: "+human.attack());

        human.setWeapon(new BowAttack());
        System.out.println("human attacked with bow: "+human.attack());


        IOSaveAndRecover.saveCharacter(human, "/home/igor/workspace/saveHumanWithBow");

        human = new Orc();

        System.out.println("Human became Orc : "+human.toString());
        try {
            human = IOSaveAndRecover.recoverCharacter("/home/igor/workspace/saveHumanWithBow");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Recovered human with bow: "+human.toString());


    }

}
