package patterns.decorator;

/**
 * Created by IMulyar on 12.11.2015.
 */
public abstract class Beverage {


    private final int cost;
    private String description;

    private boolean hasMilk;
    private boolean hasCream;

    private int milkCoast = 5;
    private int creamCost = 8;


    public Beverage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int cost(){
        int total = cost;
        if(hasMilk){
            total += milkCoast;
        }
        if(hasCream){
            total += creamCost;
        }
        return total;
    }

    public String description (){
        return description;
    }

    public void setCream (boolean hasCream){
        this.hasCream = hasCream;
    }

    public void setMilk (boolean hasMilk){
        this.hasMilk = hasMilk;
    }
}
