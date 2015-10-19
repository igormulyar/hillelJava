package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public abstract class Paint {
    private String color;


    @Override
    public String toString (){
        return color;
    }

    public abstract int getConsumptionPerMeter();
}
