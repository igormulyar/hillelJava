package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Purple extends Paint {
    String color = "purple";
    int consumptionPerMeter = 4;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}
