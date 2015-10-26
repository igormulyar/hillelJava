package homeWork10.statistics;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Created by TRUST on 24.10.2015.
 */
public class Statistics {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println("\nFOR ArrayList:");
        System.out.println(listTesting(list));

        list = new LinkedList<>();
        System.out.println("\nFOR LinkedList:");
        System.out.println(listTesting(list));

        Set<String> set = new TreeSet<>();
        System.out.println("\nFOR  TreeSet:");
        System.out.println(setTesting(set));


    }

    private static String listTesting(List<String> list) {
        String message ="";
        for (int i = 0; i <1000000; i++){
            list.add("value" + i);
        }

        Instant start = Instant.now();
        list.add(0,"value added to the beginning of the list");
        Instant stop = Instant.now();
        long duration = Duration.between(start,stop).toMillis();
        message +="Добавление элемента в начало списка прошло за " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        list.add(999999,"value added to the end of the list");
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Добавление элемента в конец списка прошло за " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        list.get(555555);
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время поиска элемента по индексу: " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        list.contains("value566666");
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время поиска элемента по объекту: " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        list.remove(566666);
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время удаления элемента по индексу: " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        list.remove("value566666");
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время удаления элемента по объекту: " + String.valueOf(duration) + "ms\n";

        return message;
    }

    private static String setTesting(Set<String> set){
        String message ="";
        for (int i = 0; i <1000000; i++){
            set.add("value" + i);
        }

        Instant start = Instant.now();
        set.add("value440101");
        Instant stop = Instant.now();
        long duration = Duration.between(start,stop).toMillis();
        message +="Время добавления элемента: " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        set.contains("value440101");
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время поиска: " + String.valueOf(duration) + "ms\n";

        start = Instant.now();
        set.remove("value440101");
        stop = Instant.now();
        duration = Duration.between(start,stop).toMillis();
        message +="Время удаления: " + String.valueOf(duration) + "ms\n";

        return message;
    }
}
