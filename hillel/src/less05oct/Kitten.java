package less05oct;

/**
 * Created by IMulyar on 22.10.2015.
 */
public class Kitten extends Cat {
    public Kitten (boolean pet, int age, String name, String color){
        super (pet, age, name, color);
    }

    @Override
    public String toString() {
        return "Kitten{}";
    }
}
