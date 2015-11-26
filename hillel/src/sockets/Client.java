package sockets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by IMulyar on 26.11.2015.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        new Client().start();
    }


    public void start () throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            send(line);
        }
    }

    private void send(String line) throws IOException {
        Socket socket = new Socket("192.168.1.157", 3111);
        PrintWriter writer = new  PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.println(line);
        writer.flush();
        writer.close();
        socket.close();
    }


}
