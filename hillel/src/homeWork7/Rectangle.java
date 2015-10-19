package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Rectangle extends Shape {

    private Paint color;
    private  int a;
    private  int b;

    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
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
