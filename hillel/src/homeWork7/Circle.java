package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Circle extends Shape {

    private Paint color;
    private int diameter;

    public Circle (int diameter){
        this.diameter = diameter;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * diameter * diameter / 4);
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * diameter);
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
