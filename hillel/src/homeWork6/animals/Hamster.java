package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class Hamster extends DomesticAnimal {

    public Hamster(int id, String name, boolean isVactinated) {
        super(id);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    @Override
    public String makeNoise() {
        return "Hello, my name is " + name + ", i'm hamster";
    }
}
