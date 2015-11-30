package bank;

/**
 * Created by IMulyar on 30.11.2015.
 */
public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        Bankier bankier1 = new Bankier(bank);
        Bankier bankier2 = new Bankier(bank);

        bankier1.start();
        bankier2.start();

        Thread.sleep(10);


        bankier1.interrupt();
        bankier2.interrupt();

        bankier1.join();
        bankier2.join();

        System.out.println(bankier1.toString());
        System.out.println(bankier2.toString());

        System.out.println(bank);
    }
}
