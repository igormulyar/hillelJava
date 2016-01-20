package java8features;

/**
 * Created by IMulyar on 14.01.2016.
 */
public class RedFiltrator implements Filtrator  {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("Red");
    }
}
