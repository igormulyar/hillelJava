package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Paralellogram extends Shape {

    private Paint color;
    private int hight;
    private int a;
    private int b;

    public Paralellogram (int h, int a, int b){
        hight = h;
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return hight * a;
    }

    @Override
    public int getPerimeter() {
        return 2 * (a + b);
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
