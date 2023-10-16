package homeworkweek6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A Java program to print the area and perimeter of a rectangle.
 */


public class Programme14Rectangle {

    private static DecimalFormat decfor = new DecimalFormat("0.00");//constructor of the DecimalFormat class

    //static method for rectangle area
    //concatenation for String
    public static void rectangleArea(double width, double height) {
        double area = width * height;
        System.out.println("Area is " + width + " * " + height + " = " + decfor.format(area));
    }

    //static method for rectangle perimeter
    //concatenation for String
    public static void perimeter(double width, double height) {
        double pm = 2 * (width + height);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + decfor.format(pm));
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
