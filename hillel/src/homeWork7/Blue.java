package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Blue extends Paint {
    String color = "blue";
    int consumptionPerMeter = 5;

    public int getConsumptionPerMeter(){
        return this.consumptionPerMeter;
    }

    @Override
    public String toString (){
        return color;
    }
}