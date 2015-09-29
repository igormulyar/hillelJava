package homeWork3;

import java.util.Scanner;

/**
 * Created by TRUST on 29.09.2015.
 * this program works with integers
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        String operation;

    }

    private static double plus(double a, double b){
        return a+b;
    }
    private static double minus (double a, double b){
        return a-b;
    }
    private static double multiple (double a, double b){
        return a*b;
    }
    private static double div (double a, double b){
        return a/b;
    }
    private static double pow (double a, double b){
        return Math.pow(a,b);
    }
    private static double sqrt (double a){
        return Math.sqrt(a); //
    }
    private static int trunk (double a){
        return (int)a;
    }
    private static double fract (double a){
        int wholeNumb = (int) a;
        a = a - wholeNumb;
        return a;
    }

    private static String dataType (double number){
        return null;
    }

}
