package patterns.ducks;

/**
 * Created by IMulyar on 26.10.2015.
 */
public class Decoy extends  Duck {

    @Override
    public String fly() {
        return "fly no way";
    }

    @Override
    public String display() {
        return "Decoy";
    }

}
