package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Green extends Paint {
    String color = "green";
    int consumptionPerMeter = 6;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}
