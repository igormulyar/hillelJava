package game;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by igor on 22.11.15.
 */
public class IOSaveAndRecover {

    public static void saveCharacter (Character character, String path){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), Charset.forName("UTF-8")))){
            bufferedWriter.write(character.toString());
        }
            catch (IOException e ){
                throw new RuntimeException(e);
        }

    }

    public static Character recoverCharacter (String path) throws IOException {
        String text;
        Character character = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), Charset.forName("UTF-8")))){
            text = bufferedReader.readLine();
        } catch (IOException e ){
            throw new RuntimeException(e);
        }


        character = parseCharacterFromTextFile(text);

        return character;
    }


    private static Character parseCharacterFromTextFile(String text) throws IOException {
        Character character;
        if (text.contains("Human")){
            character = new Human();
        }
        else if (text.contains("Elf")){
            character = new Elf();
        }
        else if (text.contains("Orc")){
            character = new Orc();
        } else{
            System.out.println("recoveryFile contains uncorrect data");
            throw new IOException();
        }

        if (text.contains("Sword")){
            character.setWeapon(new SwordAttack());
        }
        else if (text.contains("Bow")){
            character.setWeapon(new BowAttack());
        }
        else if (text.contains("Orc")){
            character.setWeapon(new HummerAttack());
        } else {
            System.out.println("recoveryFile contains uncorrect data");
            throw new IOException();
        }
        return character;
    }
}
