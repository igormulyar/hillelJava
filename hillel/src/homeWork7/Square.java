package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Square extends Shape {

    private Paint color;
    private int a;

    public Square (int a){
        this.a = a;
    }

    @Override
    public int getArea() {
        return a*a;
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public void paint(Paint color) {
        this.color=color;
    }

    @Override
    public Paint getColor() {
        return this.color;
    }

    @Override
    public int calculateConsumption() {
        return getArea() * this.color.getConsumptionPerMeter();
    }
}
