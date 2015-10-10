package homeWork6.animals;

/**
 * Created by igor on 10.10.15.
 */
public class Cat extends DomesticAnimal {


    public Cat(int id, String name, boolean isVactinated) {
        super(id);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    @Override
    public String makeNoise() {
        return "Hello, my name is " + name + ", and if you're 40 and still not married, i'm coming to you. Meow! ";
    }
}
