package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class Giraffe extends WildAnimal {

    public Giraffe(int id) {
        super(id);
        //isPredator is false by default
    }

    @Override
    public String makeNoise() {
        return "Hello, I'm wild animal, giraffe";
    }
}
