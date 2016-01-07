package database;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by IMulyar on 21.12.2015.
 */
class SingletoneExample {
    private static SingletoneExample instance;
    public String someValue;    // - bad idea

    private SingletoneExample() {

    }

    public static SingletoneExample getInstance() {

        if (instance == null) {
            synchronized (SingletoneExample.class) {
                if (instance == null) {
                    instance = new SingletoneExample();
                }
            }
        }
        return instance;
    }

    public static void clear() {
        instance = null;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int i = 0;
        while (true) {
            CompletableFuture<SingletoneExample> future1 = CompletableFuture.supplyAsync(SingletoneExample::getInstance);
            CompletableFuture<SingletoneExample> future2 = CompletableFuture.supplyAsync(SingletoneExample::getInstance);

            SingletoneExample singleton1 = future1.get();
            SingletoneExample singleton2 = future2.get();

            if (singleton1 != singleton2) {
                break;
            }
            clear();
        }
        System.out.println("There are a several instances of singleton. Attentions: " + i);
    }


    private static void oldSchoolMultithreadWork() throws InterruptedException {
        List<SingletoneExample> singletoneExamples = new ArrayList<>();
        singletoneExamples.add(null);
        singletoneExamples.add(null);

        int i = 0;
        while (true) {
            i++;
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletoneExample singletoneExample = SingletoneExample.getInstance();
                    singletoneExamples.set(0, singletoneExample);
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletoneExample singletoneExample = SingletoneExample.getInstance();
                    singletoneExamples.set(1, singletoneExample);
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();


            if (singletoneExamples.get(0) != singletoneExamples.get(1)) {
                break;
            }
            clear();

        }
        System.out.println("There are a several instances of singleton. Attentions: " + i);
    }
}
