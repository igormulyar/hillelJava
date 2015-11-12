package patterns.decorator;

import java.util.Scanner;

/**
 * Created by IMulyar on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Robusta();
        beverage.setMilk(true);
        System.out.println(beverage.description() + " " + beverage.cost());

        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();

        check(cash, beverage);
    }

    private static void check(int cash, Beverage beverage) {
        if (cash != beverage.cost()){
            System.out.println("khm");
        } else {
            System.out.println("ok");
        }
    }
}
