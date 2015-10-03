package homeWork4;

import org.omg.CORBA.PERSIST_STORE;

import java.util.Scanner;

/**
 * Created by igor on 02.10.15.
 * Как в действительности рассчитываются проценты по депозитам мне точно не известно,
 * поэтому будем исходить из того, что по истечении года к депозиту просто добавляется 3 % от начального значения
 */
public class Deposit {
    public static void main(String[] args) {
        final double percents = 0.03;
        double money;
        double years;
        double wantMoney;

        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Ваша процентная ставка по депозиту - 3% годовых\n" +
                "1 - расчитать какой станет сума вклада через N месяцев;\n" +
                "2 - расчитать, сколько лет понадобится, чтобы сумма превысила М денег.");
        do {
            System.out.println("Выберете 1 или 2");
            choice = scanner.nextInt();
        }
        while (!(choice == 1 || choice == 2));

        if (choice == 1) {
            System.out.println("Сколько денег у Вас на депозите?");
            money = scanner.nextDouble();
            System.out.println("Введите количество месяцев:");
            years = (scanner.nextDouble()) / 12;
            System.out.println(calcMonths(money, years, percents));
        } else {
            System.out.println("Сколько денег у Вас есть?");
            money = scanner.nextDouble();
            System.out.println("Введите необходимую сумму:");
            wantMoney = scanner.nextDouble();
            calcYears(money, wantMoney, percents);
        }
    }

    private static String calcMonths(double money, final double years, final double percents) {
        if (years < 1) {
            return "За это время сумма Вашего депозита не изменится";
        } else {
            for (int i = 1; i <= years; i++) {
                money += money * percents; // simplified
            }
            /** альтернативная формлула без использования цикла:
             * money = 100 * Math.pow ((1+percents), years);
             * но она не дает необходимую точность
             */
            return "Сумма Вашего депозита будет следующей: " + money;
        }
    }

    private static String calcYears(double money, final double wantMoney, final double percents) {
        int years = 0;
        if (wantMoney <= money) {
            return "У Вас уже достаточно денег.";
        } else {
            while (wantMoney < money) {
                money += money * percents; // simplified
                years++;
            }
        }
        return "Вам понадобится " + years + " лет.";
    }

}
