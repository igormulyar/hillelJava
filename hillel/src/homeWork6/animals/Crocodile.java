package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class Crocodile extends WildAnimal {

    public Crocodile(int id) {
        super(id);
        super.isPredator = true;
    }

    @Override
    public String makeNoise() {
        return "Hello, I'm a crocodile, and I'm angry!";
    }
}
