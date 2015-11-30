package multithreading;

/**
 * Created by IMulyar on 30.11.2015.
 */
public class multithreadingMain {
    public static void main(String[] args) {
        Thread otherThread =  new Thread(() -> {
            System.out.println("other thread begins");


/*            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("otherThread has been interrupted");
            }*/

            while (!Thread.currentThread().isInterrupted()){

            }

            System.out.println("Other thread end.");
        });

        // otherThread.setDaemon(true); // force otherThread closing when main otherThread ends.
        otherThread.start();

        try {
            otherThread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        otherThread.interrupt();

        try {
            otherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread end.");

    }
}
