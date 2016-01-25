package game.serverSide;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

/**
 * Created by igor on 20.12.15.
 */
public class PlayerThread implements Runnable {

    //FIELDS
    private final Socket socket2;
    private Character character = null;
    private int thisThreadIndex;
    private GameServer serverMainThread;
    private List<PlayerThread> threadList;


    //METHODS
    public PlayerThread(Socket socket2, int threadListIndex, List<PlayerThread> threadList,GameServer serverMainThread) {
        this.socket2 = socket2;
        this.thisThreadIndex = threadListIndex;
        this.serverMainThread = serverMainThread;
        this.threadList = threadList;

    }

    @Override
    public void run() {
        System.out.println("---------------------------\nRunning thread:"+Thread.currentThread().getName());
        // getting character from client
        try (ObjectInputStream objectInputStream = new ObjectInputStream(socket2.getInputStream())) {
            character = (Character) objectInputStream.readObject();
            System.out.println(Thread.currentThread().getName()+" thread has character: "+character);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (!hasCharacter() | !hasEnemy()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread # "+thisThreadIndex+"has :\n Character = "+character+"\nEnemy = "+character.getEnemy());
//
        while (true){

        }

    }



    public boolean hasCharacter (){
        return  character != null;
    }

    private boolean hasEnemy() {
        return character.getEnemy()!= null;
    }

    public Character getCharacter (){
        return  character;
    }

    public void setEnemy(Character enemy){
        character.setEnemy(enemy);

    }
}
