package homeWork5.encryption;

import java.util.Scanner;

/**
 * Created by TRUST on 07.10.2015.
 */
public class EncryptionOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение, которое хотите зашифровать или расшифровать:");
        String message = scanner.nextLine();
        System.out.println("Введите ключ:");
        String key = scanner.nextLine();

        MessageEncryptor messageEncryptor = new MessageEncryptor(key);
        String morphedMessage = messageEncryptor.crypt(message);
        System.out.println("Зашифрованное сообщение: \n" + morphedMessage);
    }
}
