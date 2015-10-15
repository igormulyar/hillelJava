package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Paralellogram extends Shape {

    Paint color;
    int side;

    public Paralellogram (int h, int w, int s){
        hight = h;
        width = w;
        side = s;
    }

    @Override
    public int getArea() {
        return hight * width;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + side);
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
