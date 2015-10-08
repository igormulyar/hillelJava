package homeWork5.encryption;

/**
 * Created by TRUST on 07.10.2015.
 */
public class MessageEncryptor {

    private String key;

    public MessageEncryptor(String key) {
        this.key = key;
    }

    public String crypt(String message) {
        char[] charArrMessage = message.toCharArray();
        char[] charArrKey = key.toCharArray();

        int k = 0;
        for (int i = 0; i < charArrMessage.length; i++) {
            charArrMessage[i] ^= charArrKey[k];
            if (k == charArrKey.length - 1) {
                k = 0;
            } else {
                k++;
            }
        }
        return String.copyValueOf(charArrMessage);
    }
}
