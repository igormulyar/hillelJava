package homeWork5.rectangleTest;

/**
 * Created by igor on 06.10.15.
 */
public class Rectangle {

    private double xSide;
    private double ySide;

    public Rectangle(double xSide, double ySide) {
        this.xSide = xSide;
        this.ySide = ySide;
    }

    public double getxSide() {
        return xSide;
    }

    public void setxSide(double xSide) {
        this.xSide = xSide;
    }

    public double getySide() {
        return ySide;
    }

    public void setySide(double ySide) {
        this.ySide = ySide;
    }

    @Override
    public String toString() {
        return "Стороны прямоуольника:\nx=" + xSide + ";\ny=" + ySide + ".";
    }
}
