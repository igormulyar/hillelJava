package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by IMulyar on 14.01.2016.
 */
public class Java8Main {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Red", 150));
        apples.add(new Apple("Green", 180));
        apples.add(new Apple("Yellow", 155));
        apples.add(new Apple("Red", 200));

        /*Filtrator redFilter = new RedFiltrator();
        List<Apple> redApples = filter(apples, redFilter);*/

        /*List<Apple> redAndHeavyApples = filter(redApples, new Filtrator() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 170;
            }
        });*/

        List<Apple> heavyApples = filter(apples, Java8Main::isHeavy);

        heavyApples = filter(apples, apple -> apple.getWeight() > 170);


        //STREAM API
        //------------------------------------
        heavyApples = apples
                .stream()
                .filter(Java8Main::isHeavy)
                .filter(apple -> apple.getColor().equals("Green"))
                .collect(Collectors.toList());
        //------------------------------------

        System.out.println(heavyApples);
    }


    private static boolean isHeavy (Apple apple){
        return apple.getWeight()>170;
    }

    private static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


    //DEFAULT METHODS
    private static void defaultMethodExample() {
        Fruit fruit = new Apple();

        System.out.println(fruit.getName());
        System.out.println(fruit.chop());

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(6);
        integers.add(4);

        //Collections.sortIntAsc(integers);
        integers.sort(Java8Main::sortIntAsc);

        integers.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(integers);
    }


    public static int sortIntAsc(Integer o1, Integer o2){
        return o1.compareTo(o2);
    }

}
