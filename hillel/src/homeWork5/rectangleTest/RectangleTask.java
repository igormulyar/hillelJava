package homeWork5.rectangleTest;


/**
 * Created by igor on 06.10.15.
 */
public class RectangleTask {
    private double s;
    private double p;

    public RectangleTask(double s, double p) {
        this.s = s;
        this.p = p;
    }

    public boolean hasSolution() {
        if (discriminant((0.5 * p), s) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public Rectangle getRectangle() {
        double x;
        double y;
        double discr = discriminant((0.5 * p), s);

        if (discr > 0) {
            y = (-(-0.5 * p) - (Math.sqrt(discr))) / 2;
            x = p / 2 - y;
            return new Rectangle(x, y);
        } else if ((int) discr == 0) {
            y = -(-0.5 * p) / 2;
            x = p / 2 - y;
            return new Rectangle(x, y);
        } else {
            return null;
        }
    }

    private double discriminant(final double b, double c) {
        return (b * b) - (4 * c);
    }
}
