/*
package homework14;

import java.io.*;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.Instant;

*/
/**
* Created by igor on 21.11.15.
*//*

public class BufferedOrNot {
    public static void main(String[] args) {


// NotBuffered
        Instant start = Instant.now();
        try (InputStream inputStream = new FileInputStream("/home/igor/workspace/test_moved.txt");
             OutputStream outputStream = new FileOutputStream("/home/igor/workspace/test_moved_byte_copy.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Instant stop = Instant.now();
        long duration = Duration.between(start, stop).toMillis();
        System.out.println("Duration (copied with not buffered stream, ms): " + duration);

//Buffered
        start = Instant.now();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream("/home/igor/workspace/test_moved.txt"), Charset.forName("UTF-8")));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream("/home/igor/workspace/test_moved_buffered_copy.txt"), Charset.forName("UTF-8")))
        ) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                bufferedWriter.write(value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stop = Instant.now();
        duration = Duration.between(start, stop).toMillis();
        System.out.println("Duration (copied with buffered stream, ms): " + duration);
    }
}


//OUT:
//Duration (copied with not buffered stream, ms): 1335
//Duration (copied with buffered stream, ms): 16
*/
