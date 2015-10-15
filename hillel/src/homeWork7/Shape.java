package homeWork7;

/**
 * Created by igor on 14.10.15.
 */
public abstract class Shape implements Paintable {
    protected int width;
    protected int hight;

    public abstract int getArea();

    public abstract int getPerimeter();
}
