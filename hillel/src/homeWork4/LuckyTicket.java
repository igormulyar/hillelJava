package homeWork4;

/**
 * Created by TRUST on 02.10.2015.
 */
public class LuckyTicket {
    public static void main(String[] args) {
        // дальше - ужасный код. Выглядит ужасно, работает медленно, но в математику лезть лень
        int counter = -1; // чтобы не учитывать билет 000000
        final int TEN = 10;

        for (int a = 0; a < TEN; a++) {
            for (int b = 0; b < TEN; b++) {
                for (int c = 0; c < TEN; c++) {
                    for (int d = 0; d < TEN; d++) {
                        for (int e = 0; e < TEN; e++) {
                            for (int f = 0; f < TEN; f++) {
                                if (a + b + c == d + e + f) {
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("В рулоне с номерами от 000001 до 999999 содержится " + counter + " счастливых билетов.");
    }
}
