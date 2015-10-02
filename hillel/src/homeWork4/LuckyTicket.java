package homeWork4;

/**
 * Created by TRUST on 02.10.2015.
 */
public class LuckyTicket {
    public static void main(String[] args) {
        int ticketsAmount = firstSolution();


        System.out.println("В рулоне с номерами от 000001 до 999999 содержится " + ticketsAmount + " счастливых билетов.");

    }

    private static int secondSolution(){
        return 0;
    }



    private static int firstSolution() {
        // дальше - ужасный код. Выглядит ужасно.
        int counter = -1; // чтобы не учитывать билет 000000
        final int ARR_LENGTH = 10;
        for (int a = 0; a < ARR_LENGTH; a++) {
            for (int b = 0; a < ARR_LENGTH; a++) {
                for (int c = 0; c < ARR_LENGTH; c++) {
                    for (int d = 0; d < ARR_LENGTH; d++) {
                        for (int e = 0; e < ARR_LENGTH; e++) {
                            for (int f = 0; f < ARR_LENGTH; f++) {
                                if (a + b + c == d + e + f) {
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }
}
