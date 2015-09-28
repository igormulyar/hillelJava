package homeWork2;

import java.util.Scanner;

/**
 * Created by igor on 25.09.15.
 * адская алгебра 8 класса, пришлось читать о квадратных уравнениях, мать их..
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the area (S) of a rectangle: ");
        double s = scanner.nextDouble();
        System.out.println("Enter the perimeter(P) of a rectangle: ");
        double p = scanner.nextDouble();

        // rectangle sides
        double x;
        double y;
        double x2;
        double y2;

        // calculations
        // FORMULA: y^2 - 1/2yp + s = 0;
        // a=1  - didnt obviously used, cause its value is "1";       b= -(0.5*p);       c = s;
        double discr = discriminant((0.5 * p), s);

        if (discr > 0) {
            y = (-(-0.5 * p) - (Math.sqrt(discr))) / 2;
            x = p / 2 - y;
            System.out.print("Side x1 is " + x + " and side y1 is " + y + " or....");
            y2 = (-(-0.5 * p) + (Math.sqrt(discr))) / 2;
            x2 = p / 2 - y2;
            System.out.print("Side x2 is " + x2 + " and side y2 is " + y2);
        } else if ((int)discr == 0) {
            y = -(-0.5 * p) / 2;
            x = p / 2 - y;
            System.out.println("Side x is " + x + " and side y is " + y);
        } else {
            System.out.println("The rectangle with such parameters does not exists.");
        }

    }

    public static double discriminant(final double b, double c) {
        // FORMULA: discr = b^2 - 4ac;  a=1, thats why:
        // discr = b^2-4c;
        return (b * b) - (4 * c);
    }

}
