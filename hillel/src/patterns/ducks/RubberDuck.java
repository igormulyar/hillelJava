package patterns.ducks;

/**
 * Created by IMulyar on 26.10.2015.
 */
public class RubberDuck extends Duck {
    @Override
    String display() {
        return "rubber duck";
    }

    @Override
    public String quack() {
        return "squick";
    }

    @Override
    public String fly() {
        return "fly no way";
    }
}
