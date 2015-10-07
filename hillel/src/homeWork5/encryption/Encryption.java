package homeWork5.encryption;

import java.util.Scanner;

/**
 * Created by igor on 06.10.15.
 */

// Макс, не должен ли был я решить эту задачу с помощью ООП?

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение, которое хотите зашифровать или расшифровать:");
        char[] message = scanner.nextLine().toCharArray();
        System.out.println("Введите ключ:");
        char[] key = scanner.nextLine().toCharArray();
        String morphedMessage = crypt(message, key);
        System.out.println("Зашифрованное сообщение: \n" + morphedMessage);
    }

    private static String crypt(char[] message, char[] key) {
        int k = 0;
        for (int i = 0; i < message.length; i++) {
            message[i] ^= key[k];
            if (key[k] == key.length - 1) {
                k = 0;
            }
        }
        return String.copyValueOf(message);
    }

}
