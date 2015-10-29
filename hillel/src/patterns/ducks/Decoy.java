package patterns.ducks;

/**
 * Created by IMulyar on 26.10.2015.
 */
public class Decoy extends  Duck {

    public Decoy (){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "Decoy";
    }

}
