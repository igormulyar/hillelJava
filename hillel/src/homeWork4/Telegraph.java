package homeWork4;

import java.util.Scanner;

/**
 * Created by igor on 02.10.15.
 */
public class Telegraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст телеграммы, затем для расчета стоимости нажмите Enter:");
        String message = scanner.nextLine();
        printBill(message);
    }

    private static void printBill (String message){
        final int oneWordPrice = 2;
        int finalPrice=0;
        String[] words = message.split("\\s");
        for(int i =0; i<words.length; i++){
            finalPrice += oneWordPrice;
        }
        System.out.println("К оплате: "+finalPrice);
    }
}
