package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by IMulyar on 26.11.2015.
 */
public class SocketThread implements Runnable {

    private final Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try
                (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 Socket localSocket = socket;) {


            while (true) {
                String message = reader.readLine();

                if (message == null) {
                    System.out.println(/*"disconnected"*/);
                    break;
                }

                System.out.println(message);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
