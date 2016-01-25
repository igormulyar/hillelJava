package game.serverSide;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 13.12.15.
 */
public class GameServer {

    private final static int port = 1444;
    private static PlayerThread playerThread1 = null;
    private static PlayerThread playerThread2 = null;
    private static List<PlayerThread> threadList = new ArrayList<>(2);
    private static GameServer gameServer;

    public static void main(String[] args) throws IOException, InterruptedException {
        gameServer = new GameServer();
        gameServer.start();

    }

    public static void start() throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Waiting for a client 1...");
        Socket socket1 = serverSocket.accept();
        System.out.println("Got a client 1");
        playerThread1 = new PlayerThread(socket1, 0, threadList, gameServer);
        threadList.add(playerThread1);
        Thread thread1 = new Thread(playerThread1);
        thread1.start();
        if (thread1 != null) System.out.println("Thread 1 created!");

        System.out.println("Waiting for a client 2...");
        Socket socket2 = serverSocket.accept();
        System.out.println("Got a client 2");
        playerThread2 = new PlayerThread(socket2, 1, threadList, gameServer);
        threadList.add(playerThread2);
        Thread thread2 = new Thread(playerThread2);
        thread2.start();
        if (thread1 != null) System.out.println("Thread 1 created!");

        while (!playerThreadsAreReady()) {
            Thread.sleep(500);
        }
//        playerThread1.setEnemy(playerThread2.getCharacter());
//        playerThread2.setEnemy(playerThread1.getCharacter());

        playerThread1.getCharacter().setEnemy(playerThread2.getCharacter());
        playerThread2.getCharacter().setEnemy(playerThread1.getCharacter());
        System.out.println("Ready to play!");
    }

    public static synchronized boolean playerThreadsAreReady() {
        return ((playerThread1 != null && playerThread2 != null) && (playerThread1.hasCharacter() && playerThread2.hasCharacter()));
    }


}
