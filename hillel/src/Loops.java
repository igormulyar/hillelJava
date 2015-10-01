import java.util.Scanner;
/**
 * Created by IMulyar on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {

        forExample();
    }

    public static void forExample() {
        for (int i = 0; i<10; i++){
            System.out.println("for loop: "+ i);
        }
    }

    public static void doWhileExemple() {
        Scanner scanner = new Scanner (System.in);
        String yesNo;
        do {
            System.out.println("yes/no");
            yesNo = scanner.next();
        } while (!yesNo.equals("yes") || !yesNo.equals("no"));

        System.out.println("You've entered: "+yesNo);
    }

    public static void whileExample() {
        int money = 10000;
        int month = 0;
        while(money<1500){
            money +=100;
            month++;
        }
        System.out.println("money: "+ money+ " months: "+ month);
    }
}
