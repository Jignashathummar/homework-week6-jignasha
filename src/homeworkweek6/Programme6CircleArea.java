package homeworkweek6;

import java.util.Scanner;

// A program to enter any radius value of the circle and find out the area (Formula of Area A=PI*r*r).
public class Programme6CircleArea {
    //static method for circle Area
    //Math library for value of PI(3.14) and power of
    public static void circleArea(double radius) {
        double area = (Math.PI * Math.pow(radius, 2));
        System.out.println("Area of circle is: " + area);
    }

    //scanner declaration in main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = scanner.nextDouble();
        circleArea(r);
        scanner.close();
    }
}
