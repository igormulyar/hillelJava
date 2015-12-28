package game.serverSide;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * Created by igor on 20.12.15.
 */
public class PlayerThread implements Runnable {

    private final Socket socket2;
    Character character = null;

    public PlayerThread(Socket socket2) {
        this.socket2 = socket2;
    }

    @Override
    public void run() {
        // getting character from client
        try (ObjectInputStream objectInputStream = new ObjectInputStream(socket2.getInputStream())) {
            character = (Character) objectInputStream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (!hasCharacter()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public boolean hasCharacter (){
        return  character != null;
    }

    public Character getCharacter (){
        return  character;
    }
}
