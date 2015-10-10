package homeWork6.animals;

/**
 * Created by igor on 11.10.15.
 */
public class Test {
    public static void main(String[] args) {

        Animal[] animals = new Animal[9];

        animals[0] = new Cat(1, "Barsik", false);

        animals[1] = new Crocodile(2);

        animals[2] = new Doge(3, "Doge", true);

        animals[3] = new Fish(4, "Ihtiondr", false);

        animals[4] = new Giraffe(5);

        animals[5] = new GuideDog(6, "Bob", true);

        animals[6] = new Hamster(7, "Rico", true);

        animals[7] = new Lion(8);

        animals[8] = new Wolf(9);

        for (Animal a : animals) {
            System.out.println(a.makeNoise());
        }

    }
}
