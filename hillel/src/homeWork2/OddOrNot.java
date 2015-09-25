package homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by igor on 25.09.15.
 */
public class OddOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the integer:");
        int var = Integer.parseInt(reader.readLine());

        if (var%2==0){
            System.out.println("This integer is even.");
        }
        else {
            System.out.println("This integer is odd.");
        }
    }
}
