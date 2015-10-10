package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class Lion extends WildAnimal {

    public Lion(int id) {
        super(id);
        super.isPredator = true;
    }

    @Override
    public String makeNoise() {
        return "Hello, I'm a lion, and I'm angry!";
    }
}
