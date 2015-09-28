
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

/**
 * Created by IMulyar on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {


    }

    public static void ternaryExample() {
        int number = 5;
        String isEven = null;
        isEven = (number % 2 == 0)? "Yessss!" : "noooooo!";
    }

    public static String isEven(int someNumber) {
        if (someNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static void switchExample2() {
        String month = "march";
        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("winter");
                break;
            case "march":
            case "apr":
            case "may":
                System.out.println("spring");
                break;
            default:
                System.out.println("wrong month name: " + month);
                break;
        }
    }

    private static void switchCaseExample() {
        String month = "may";
        switch (month) {
            case "jan":
                System.out.println(1);
                break;
            case "may":
                System.out.println(5);
                break;
            case "aug":
                System.out.println(8);
                break;
            case "dec":
                System.out.println(12);
                break;
            default:
                System.out.println("Wrong month name!");
                break;
            case "feb":
                System.out.println(2);
                break;
        }
    }

    private static void ifExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.println("you are young!");
        } else {
            System.out.println("You aren't so young!");
        }
        /*        if (age<10){
            System.out.println("kid");
        }
        else if (age<20){
            System.out.println("teen");
        }
        else if (age<50){
            System.out.println("adult");
        }
        else {
            System.out.println("old");
        }

        if (age >=0 && age <=10){
            System.out.println("kid");
        }
        if (age>10 && age < 20){
            System.out.println("teen");
        }
        if (age >=20 && age<50){
            System.out.println("adult");
        }
        if (age >=50){
            System.out.println("old");
        }*/
    }


    private static void ifExplanation() {
        boolean condition = 5 > 6;

        if (condition) System.out.println("in If");

        if (condition) {
            System.out.println("in If");
        }

        if (condition) {
            System.out.println("in If");
            System.out.println("still in if block");
        } else {
            System.out.println("in ELSE block");
        }

        System.out.println("out of IF block");
    }
}
