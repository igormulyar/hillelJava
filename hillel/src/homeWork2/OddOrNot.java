package homeWork2;

import java.util.Scanner;

/**
 * Created by igor on 25.09.15.
 */
public class OddOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the integer:");
        int var = scanner.nextInt();

        if (var % 2 == 0) {
            System.out.println("This integer is even.");
        } else {
            System.out.println("This integer is odd.");
        }
    }
}
