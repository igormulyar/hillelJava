package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Red extends Paint {
    String color = "red";
    int consumptionPerMeter = 8;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}
