package multithreading.producerConsumer;

/**
 * Created by IMulyar on 03.12.2015.
 */
public class Bucket {
    private int count;
    private final int maxCount= 50;


    public synchronized void put(){

        while (count == maxCount){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

        count++;
        notifyAll();
    }

    public synchronized void get(){
        while (count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        count--;

        notifyAll();

    }

}
