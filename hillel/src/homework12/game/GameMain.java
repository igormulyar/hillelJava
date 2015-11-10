package homework12.game;

/**
 * Created by TRUST on 30.10.2015.
 */
public class GameMain {
    public static void main(String[] args) {

        Character character = new Human();
        System.out.println(character.attack());

        character = new Elf();
        System.out.println(character.attack());

        character = new Orc();
        System.out.println(character.attack());
    }
}
