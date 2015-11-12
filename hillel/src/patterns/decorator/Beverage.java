package patterns.decorator;

/**
 * Created by IMulyar on 12.11.2015.
 */
public abstract class Beverage {

    private int cost;
    private String description;

    public Beverage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int cost(){
        return cost;
    }

    public String description (){
        return description;
    }
}
