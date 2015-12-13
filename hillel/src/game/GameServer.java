package game;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by igor on 13.12.15.
 */
public class GameServer {
    public static void main(String[] args) throws IOException {
        new GameServer().start();

    }

    public static void start () throws IOException {
        ServerSocket serverSocket = new ServerSocket(1212);


    }

}
