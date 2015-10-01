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
            calcMonths(scanner); // в качестве параметра передается ссылка на уже созданный объект сканера.(IDE так автоматически сделала)
            // Надеюсь, так можно сэкономить немного памяти и єто имеет смысл.
        } else {
            calcYears(scanner);
        }
    }

    private static void calcMonths(Scanner scanner) {
        final double PERCENTS = 0.03;
        System.out.println("Сколько денег у Вас на депозите?");
        double money = scanner.nextDouble();
        System.out.println("Введите количество месяцев:");
        double years = (scanner.nextDouble()) / 12;
        if (years < 1) {
            System.out.println("За это время сумма Вашего депозита не изменится");
        } else {
            for (int i = 1; i <= years; i++) {
                money = money + money * PERCENTS;
            }
            System.out.println("Сумма Вашего депозита будет следующей: " + money);
        }
    }

    private static void calcYears(Scanner scanner) {
        final double PERCENTS = 0.03;
        System.out.println("Сколько денег у Вас есть?");
        double money = scanner.nextDouble();
        System.out.println("Введите необходимую сумму:");
        double wantMoney = scanner.nextDouble();
        int years = 0;
        if (wantMoney <= money) {
            System.out.println("У Вас уже достаточно денег.");
        } else {
            do {
                money = money + money * PERCENTS;
                years++;
            } while (money < wantMoney);
        }
        System.out.println("Вам понадобится " + years + " лет.");
    }

}
