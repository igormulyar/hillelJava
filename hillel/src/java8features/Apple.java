package java8features;

/**
 * Created by IMulyar on 14.01.2016.
 */
public class Apple implements Fruit {

    private String color;
    private int weight;

    public Apple(){}

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return "Apple";
    }


    @Override
    public String chop() {
        return "Chopped apple";
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
