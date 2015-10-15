package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Square extends Shape {

    Paint color;

    public Square (int h){
        hight = width = h;
    }

    @Override
    public int getArea() {
        return hight*hight;
    }

    @Override
    public int getPerimeter() {
        return 4 * hight;
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
