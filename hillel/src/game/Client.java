package game;


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
public class Client {
    private Socket socket = null;

    public static void main(String[] args) {
        new Client().start();
    }

    private void start() {

        System.out.println("Would you like to create new random character (press 1) or to load it from file(press 2)");
        game.serverSide.Character character = createPlayer();
        System.out.println("OK. Your character is created: " + character.toString() + " Let me connect to the server and send it to the server.");
        sendCharacterToServer(character);
        System.out.println("Your character successfully sent to server.");


    }

    private void sendCharacterToServer(Character character) {
        try {
            socket = new Socket("localhost", 1444);
            System.out.println("Socket connected.");
        } catch (IOException e) {
            System.out.println("Socket cant connect to servers socket");
            e.printStackTrace();
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())) {
            objectOutputStream.writeObject(character);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            socket.close();
        } catch (IOException e) {
            System.out.println("Cant close the socket.");
            e.printStackTrace();
        }


    }

    private static game.serverSide.Character createPlayer() {
        Character character = null;
        int choice = new Scanner(System.in).nextInt();
        while (character == null) {
            switch (choice) {
                case 1:
                    character = newRandomCharacter();
                    break;
                case 2:
                    System.out.println("Please type the path to your character on the disk: ");
                    String path = new Scanner(System.in).nextLine();
                    try {
                        character = IOSaveAndRecover.recoverCharacter(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("try again. something wrong");
            }
        }
        return character;
    }

    private static Character newRandomCharacter() {
        List<Character> list = new ArrayList<>();
        list.add(new Human());
        list.add(new Elf());
        list.add(new Orc());
        return list.get(new Random().nextInt(3));
    }


}
