package homeWork6.animals;

/**
 * Created by igor on 10.10.15.
 */
public class Fish extends DomesticAnimal {

    String name;
    boolean isVactinated;

    public Fish(int id, String name, boolean isVactinated) {
        super(id);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    @Override
    public String makeNoise() {
        return "(fish): ....";
    }
}
