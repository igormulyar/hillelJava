package homeWork7;

/**
 * Created by TRUST on 15.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Square(6);
        System.out.println("shape area = "+shape.getArea()+" shape perimeter = "+shape.getPerimeter());
        Paintable paintableShape = shape;
        System.out.println("shape's color is referenced to "+paintableShape.getColor());
        Paint color = new Purple();
        paintableShape.paint(color);
        System.out.println("Now the shape is "+paintableShape.getColor().toString()+".");
        System.out.println("Paint consumption is "+paintableShape.getColor().getConsumptionPerMeter()+
                " liters per square meter");
        System.out.println(paintableShape.calculateConsumption()+" liters of paint was used to color the shape");
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
