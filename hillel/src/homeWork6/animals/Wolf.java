package homeWork6.animals;

/**
 * Created by igor on 10.10.15.
 */
public class Wolf extends WildAnimal {

    public Wolf(int id) {
        super(id);
        super.isPredator = true;
    }

    @Override
    public String makeNoise() {
        return "Hello, I'm a wolf, and I'm angry!";
    }
}
