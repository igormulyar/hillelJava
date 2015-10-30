package homeWork11.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class GameMain {
    public static void main(String[] args) {

        Person person = new Human();
        System.out.println("human attack: " + person.attack());

        person = new Elf();
        System.out.println("elf attack: " + person.attack());

        person = new Orc();
        System.out.println("orc attack: " + person.attack());
    }
}
