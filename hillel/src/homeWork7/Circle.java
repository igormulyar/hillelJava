package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public class Circle extends Shape {

    Paint color;

    public Circle (int h){
        hight = width = h;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * hight * hight / 4);
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * hight);
    }

    @Override
    public void paint(Paint color) {
        this.color=color;
    }

    @Override
    public Paint showColor() {
        return this.color;
    }

    @Override
    public int showConsumption() {
        return getArea() * this.color.getConsumptionPerMeter();
    }
}
