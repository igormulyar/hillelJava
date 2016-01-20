package game.serverSide;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by igor on 13.12.15.
 */
public class GameServer {

    private final static int port = 1444;
    private static PlayerThread playerThread1;
    private static PlayerThread playerThread2;

    public static void main(String[] args) throws IOException, InterruptedException {
        new GameServer().start();

    }

    public static void start() throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(port);


        System.out.println("Waiting for a client 1...");
        Socket socket1 = serverSocket.accept();
        System.out.println("Got a client 1");
        playerThread1 = new PlayerThread(socket1);
        Thread thread1 = new Thread(playerThread1);

        System.out.println("Waiting for a client 2...");
        Socket socket2 = serverSocket.accept();
        System.out.println("Got a client 2");
        playerThread2 = new PlayerThread(socket2);
        Thread thread2 = new Thread(playerThread2);

        while (!playerThreadsAreReady()) {
            Thread.sleep(500);
        }

        playerThread1.getCharacter().setEnemy(playerThread2.getCharacter());
        playerThread2.getCharacter().setEnemy(playerThread1.getCharacter());
        System.out.println("Ready to play!");
    }

    public static synchronized boolean playerThreadsAreReady() {
        return ((playerThread1 != null && playerThread2 != null) && (playerThread1.hasCharacter() && playerThread2.hasCharacter()));
    }


}
