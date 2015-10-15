package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Yellow extends Paint {
    String color = "yellow";
    int consumptionPerMeter = 7;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}
