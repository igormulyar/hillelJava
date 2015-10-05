package homeWork5.rectangleTest;

import java.util.Scanner;

/**
 * Created by igor on 06.10.15.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double s=0;
        double p=0;

        System.out.println("Enter the area (S) of a rectangle: ");
        s = scanner.nextDouble();
        System.out.println("Enter the perimeter(P) of a rectangle: ");
        p = scanner.nextDouble();
        RectangleTask rectangleTask = new RectangleTask(s,p);
        if (rectangleTask.hasSolution()){
        System.out.println("solution for rectangleTask1: "+rectangleTask.getRectangle().toString());
        } else{
            System.out.println("No solution for this parameters.");
        }


    }
}
