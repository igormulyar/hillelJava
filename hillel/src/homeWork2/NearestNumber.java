package homeWork2;

import java.util.Scanner;

/**
 * Created by igor on 25.09.15.
 */
public class NearestNumber {
    public static void main(String[] args) {
        final int TEN = 10;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, enter the first integer:");
        int a = scanner.nextInt();
        System.out.println("Please, enter the second integer:");
        int b = scanner.nextInt();

        if (Math.abs(TEN-a) < Math.abs(TEN-b)){
            System.out.println(a+" is closer to 10");
        }
        else if (Math.abs(TEN-a) > Math.abs(TEN-b)){
            System.out.println(b+" is closer to 10");
        }
        else {
            System.out.println("Your numbers are equally close to ten");
        }
    }
}
