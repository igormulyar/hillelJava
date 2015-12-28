package game;


import game.serverSide.*;
import game.serverSide.Character;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by TRUST on 30.10.2015.
 */
public class GameMain {
    public static void main(String[] args) {
        System.out.println("Hello! I want you to play some game))..\n");
        sleepMainThread(1000);

        System.out.println("CREATING THE PLAYER-1:");
        System.out.println("Would you like to create new random character (press 1) or to load it from file(press 2)");
        game.serverSide.Character character1 = createPlayer();
        System.out.println("Congratulations, you successfully chose a new character. Information about it: " + character1.toString()+"\n");

        Socket socket = new Socket();


        System.out.println("To start the game, press ENTER:");
        new Scanner(System.in).nextLine();
    }








    private static Character createPlayer() {
        Character character = null;
        int choice = new Scanner(System.in).nextInt();
        while (character == null){
            switch (choice){
                case 1 :
                    character = newRandomCharacter();
                    break;
                case 2 :
                    System.out.println("Please type the path to your character on the disk: ");
                    String path = new Scanner(System.in).nextLine();
                    try {
                        character = IOSaveAndRecover.recoverCharacter(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default :
                    System.out.println("try again. something wrong");
            }
        }
        return character;
    }


    private static void sleepMainThread(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }


    private static Character newRandomCharacter (){
        List<Character> list = new ArrayList<>();
        list.add(new Human());
        list.add(new Elf());
        list.add(new Orc());
        return list.get(new Random().nextInt(3));
    }

}
