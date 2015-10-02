package homeWork4;

import java.util.Scanner;

/**
 * Created by igor on 02.10.15.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение, которое хотите зашифровать или расшифровать:");
        String message = scanner.nextLine();
        System.out.println("Введите ключ (один символ)");
        char key = scanner.next().charAt(0);
        String morphedMessage = crypt(message, key);
        System.out.println("Зашифрованное сообщение: \n" + morphedMessage);
    }

    public static String crypt(String message, char key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ key);   // интересно, что при короткой записи "chars[i]^=key;" к чару приводить не нужно
        }
        return String.copyValueOf(chars);
    }

}
