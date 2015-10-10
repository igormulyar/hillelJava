package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class GuideDog extends Doge {

    public GuideDog(int id, String name, boolean isVactinated) {
        super(id, name, isVactinated);
    }

    @Override
    public String makeNoise() {
        return "Hello, my name is " + name + ", I can take you home.";
    }
}
