package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Orange extends Paint {
    String color = "orange";
    int consumptionPerMeter = 9;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}
