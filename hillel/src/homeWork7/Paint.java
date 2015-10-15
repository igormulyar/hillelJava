package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public abstract class Paint {
    protected String color;
    protected int consumptionPerMeter;

    @Override
    public String toString (){
        return color;
    }

    public abstract int getConsumptionPerMeter();
}
