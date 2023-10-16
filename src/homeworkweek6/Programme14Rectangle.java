package homeworkweek6;

import java.util.Scanner;

/**
 * A Java program to print the area and perimeter of a rectangle.
 */

public class Programme14Rectangle {

    //static method for rectangle area
    //concatenation for String
    public static void rectangleArea(double width, double height) {
        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
    }

    //static method for rectangle perimeter
    //concatenation for String
    public static void perimeter(double width, double height) {

        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + 2 * (width + height));
    }

    //Scanner used in main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of height: ");
        double h = scanner.nextDouble();
        System.out.println("Enter value of width: ");
        double w = scanner.nextDouble();
        rectangleArea(h, w);
        perimeter(h, w);
        scanner.close();
    }
}
