package homeWork6.animals;

/**
 * Created by igor on 10.10.15.
 */

/**
 * http://cdn.memegenerator.net/instances/500x/43647691.jpg
 */
public class Doge extends DomesticAnimal {

    public Doge(int id, String name, boolean isVactinated) {
        super(id);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    @Override
    public String makeNoise() {
        return "Hello, my name is " + name + " Woof-Woof, very Java!";
    }

}
