package homeWork4;

import java.util.Scanner;

/**
 * Created by igor on 02.10.15.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        final int randNumb = (int) (Math.random() * 9 + 1);
        int answer;
        int attempts = 1;
        //System.out.println(randNumb);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал целое число от 1 до 10. Попробуйте отгадать. Ваш ответ введите ниже:");

        do {
            answer = scanner.nextInt();
            if (answer != randNumb) {
                System.out.println(compareInts(randNumb, answer));
                attempts++;
            } else {
                System.out.println("Поздравляем! Вы угадали число с " + attempts + " попытки!");
            }
        } while (answer != randNumb);

    }

    private static String compareInts(final int randNumb, final int answer) {
        if (randNumb > answer) {
            return "Загаданное число больше!";
        } else
            return "Загаданное число меньше!";

    }
}
