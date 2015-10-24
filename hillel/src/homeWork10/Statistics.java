package homeWork10;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by TRUST on 24.10.2015.
 */
public class Statistics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <100; i++){
            list.add("value" + i);
        }
        arrayListTesting(list);


        Set<String> set = new TreeSet<>();

    }

    private static void arrayListTesting(List list) {
        String message ="";

        long begin = Instant.now().toEpochMilli();

        list.add(2,"value added to the beginning of the list");

        long end = Instant.now().toEpochMilli();

        long duration = end - begin;

    }
}
