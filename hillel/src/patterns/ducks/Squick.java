package patterns.ducks;

/**
 * Created by IMulyar on 29.10.2015.
 */
public class Squick  implements  QuackBehavior{
    @Override
    public String quack() {
        return "squick";
    }
}
