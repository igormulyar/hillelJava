package homeWork6.artificalIntelligence;

/**
 * Created by igor on 11.10.15.
 */

// Controller and View in one class ((
// Danger! GovnoCode detected!
public class Controller {
    public static void main(String[] args) throws InterruptedException {
        int attempts = 1;

        System.out.println("Состязания компьютера с самим собой объявляется открытым!" +
                "\nСейчас компьютер загадает число, а затем попробует его отгадать.\n");
        Proposer proposer = new Proposer();
        System.out.println("Компьютер загадывает число от 1 до 100.....: "+proposer.getRandNumb());
        Guesser guesser = new Guesser();
        Thread.sleep(1500);
        System.out.println("...а теперь пытается отгадать. Итак первая попытка: "+guesser.getGuessNumber());
        if (proposer.equals(guesser.getGuessNumber())){
            Thread.sleep(1500);
            System.out.println("Ничоси! Компьютер угадал число с первой попытки!");
        } else {
            attempts++;
            while(!proposer.equals(guesser.generateNewAnswer(proposer.pIsGreaterThanG(guesser.getGuessNumber())))) {
                Thread.sleep(1500);
                System.out.println("Компьютер пробует число "+guesser.getGuessNumber());
                attempts++;
            }
        }
        System.out.println("Ура! Компьютер отгадал число - "+guesser.getGuessNumber());
        System.out.println("число попыток:"+attempts);


    }
}
