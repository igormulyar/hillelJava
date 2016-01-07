package game;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import game.serverSide.*;
import game.serverSide.Character;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by igor on 13.12.15.
 */
public class Client1 {

    public static void main(String[] args) {
        new Client1().start();
    }

    private void start() {

        System.out.println("Would you like to create new random character (press 1) or to load it from file(press 2)");
        game.serverSide.Character character1 = createPlayer();
        System.out.println("OK. Your character is created. Let me connect to the server and send it to the server.");
        sendCharacterToServer(character1);
        System.out.println("Your character successfully sent to server.");


    }

    private void sendCharacterToServer(Character character) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 1444);
        } catch (IOException e) {
            System.out.println("Socket cant connect to servers socket");
            e.printStackTrace();
        }

        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("ObjectOutputStream cant get OutputStream from socket");
            e.printStackTrace();
        }

        try {
            objectOutputStream.writeObject(character);
        } catch (IOException e) {
            System.out.println("ObjectOutputStream can NOT write character to server");
            e.printStackTrace();
        }


    }

    private static game.serverSide.Character createPlayer() {
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

    private static Character newRandomCharacter (){
        List<Character> list = new ArrayList<>();
        list.add(new Human());
        list.add(new Elf());
        list.add(new Orc());
        return list.get(new Random().nextInt(3));
    }


}
