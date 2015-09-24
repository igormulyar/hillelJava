
import java.util.Scanner;
/**
 * Created by IMulyar on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("please enter your age:");
        int age = scanner.nextInt();
        if  (age<20){
            System.out.println("you are young!");
        }
        else {
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
        boolean condition = 5>6;

        if (condition) System.out.println("in If");

        if (condition) {
            System.out.println("in If");
        }

        if (condition) {
            System.out.println("in If");
            System.out.println("still in if block");
        }
        else {
            System.out.println("in ELSE block");
        }

        System.out.println("out of IF block");
    }
}
