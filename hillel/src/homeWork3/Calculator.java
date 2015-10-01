package homeWork3;

import java.util.Scanner;

/**
 * Created by TRUST on 29.09.2015.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для вывода инструкции введите \"man\", иначе - любой другой символ");
        String instruction = scanner.next();
        if (instruction.equals("man")) {
            printManual();
        }
        while (true) {
            working();
            System.out.println("Еще?  (Для продолжения введите \"Y\", для выхода - любой другой символ.)");
            String wantMore = scanner.next();
            if (wantMore.equals("Y")) {
                continue;
            } else {
                break;
            }
        }
    }

    private static void working() {
        Scanner scannerForDoubles = new Scanner(System.in);
        Scanner scannerForText = new Scanner(System.in);
        // уж лучше бы использовал BufferedReader...
        // Проблема такого рода: http://stackoverflow.com/questions/5032356/using-scanner-nextline
        // мой вывод - сканер - фигня
        double a;
        double b;
        String operation;
        double result = 0;

        System.out.println("Введите число: ");
        a = scannerForDoubles.nextDouble();
        System.out.println("Введите операцию: ");
        operation = scannerForText.nextLine();

        switch (operation) {
            case "+":
                System.out.println("Введите второе число: ");
                b = scannerForDoubles.nextDouble();
                result = plus(a, b);
                break;
            case "-":
                System.out.println("Введите второе число: ");
                b = scannerForDoubles.nextDouble();
                result = minus(a, b);
                break;
            case "*":
                System.out.println("Введите второе число: ");
                b = scannerForDoubles.nextDouble();
                result = multiple(a, b);
                break;
            case "/":
                System.out.println("Введите второе число: ");
                b = scannerForDoubles.nextDouble();
                result = div(a, b);
                break;
            case "pow":
                System.out.println("Введите второе число: ");
                b = scannerForDoubles.nextDouble();
                result = pow(a, b);
                break;
            case "sqrt":
                result = sqrt(a);
                break;
            case "trunk":
                result = trunk(a);
                break;
            case "fract":
                result = fract(a);
                break;
            default:
                System.out.println("Парень, ты где-то накосячил... попробуй сначала.");
                break;
        }

        System.out.println("Результат: " + result + " " + dataType(result));
    }

    private static double plus(double a, double b) {
        return a + b;
    }

    private static double minus(double a, double b) {
        return a - b;
    }

    private static double multiple(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        return a / b;
    }

    private static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    private static double sqrt(double a) {
        return Math.sqrt(a);
    }

    private static int trunk(double a) {
        return (int) a;
    }

    private static double fract(double a) {
        long wholeNumb = (long) a;
        a = a - wholeNumb;
        return a;
    }

    private static String dataType(double number) {
        if (fract(number) != 0)
            return " (double)";
        else {
            if (number <= 127 && number >= -128) {
                return " (byte)";
            } else if (number <= 32767 && number >= -32768) {
                return " (short)";
            } else if (number <= 2147483647 && number >= -2147483648) {
                return " (int)";
            } else if (number <= 9223372036854775807L && number >= -9223372036854775808L)
            {
                return " (long)";
            }
            else {
                return " (so double)";
            }
        }
    }

    private static void printManual() {
        System.out.println("После каждого ввода, следует нажать Enter");
        System.out.println("Поддерживаются следующие операции:");
        System.out.println("\"+\" - сложение");
        System.out.println("\"-\" - вычитаниие");
        System.out.println("\"*\" - умножение");
        System.out.println("\"/\" - деление");
        System.out.println("\"pow\" - возведение в степень");
        System.out.println("\"sqrt\" - квадратный корень");
        System.out.println("\"trunk\" - отбрасывание дробной части");
        System.out.println("\"fract\" - отбрасывание целой части");
        System.out.println("------------------------\n");
    }

}
