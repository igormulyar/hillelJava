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

    public double getXSide() {
        return xSide;
    }

    public void setXSide(double xSide) {
        this.xSide = xSide;
    }

    public double getYSide() {
        return ySide;
    }

    public void setYSide(double ySide) {
        this.ySide = ySide;
    }

    @Override
    public String toString() {
        return "Стороны прямоуольника:\nx=" + xSide + ";\ny=" + ySide + ".";
    }
}
