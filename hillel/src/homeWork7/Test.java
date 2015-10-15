package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle(4);
        System.out.println("shape area = "+shape.getArea()+" shape perimeter = "+shape.getPerimeter());
        Paintable paintableShape = shape;
        System.out.println("shape's color is referenced to "+paintableShape.showColor());
        Paint color = new Purple();
        paintableShape.paint(color);
        System.out.println("Now the shape is "+paintableShape.showColor().toString()+".");
        System.out.println("Paint consumption is "+paintableShape.showColor().getConsumptionPerMeter()+
                " liters per square meter");
        System.out.println(paintableShape.showConsumption()+" liters of paint was used to color the shape");
    }

}

/*
OUT:
shape area = 12 shape perimeter = 12
shape's color is referenced to null
Now the shape is purple.
Paint consumption is 4 liters per square meter
48 liters of paint was used to color the shape
*/
