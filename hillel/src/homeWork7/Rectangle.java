package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Rectangle extends Shape {

    Paint color;

    public Rectangle (int h, int w){
        hight = h;
        width = w;
    }

    @Override
    public int getArea() {
        return hight * width;
    }

    @Override
    public int getPerimeter() {
        return 2 * (hight + width);
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
