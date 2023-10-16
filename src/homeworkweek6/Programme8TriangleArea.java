package homeworkweek6;

import java.util.Scanner;

/**
 * A program to calculate the area of triangle.
 **/
public class Programme8TriangleArea {

    // Static method for area of triangle
    public static void trianglearea(int a, int b, int c) {
        // semi-parameter for average of side
        int semiParameter = (a + b + c) / 2;
        // Logic area of triangle
        double area = Math.sqrt(semiParameter * (semiParameter - a) * (semiParameter - b) * (semiParameter - c));
        System.out.println("Area of triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the value of triangle side a: ");
        int a = scanner.nextInt();
        System.out.println("Please Enter the value of triangle side b: ");
        int b = scanner.nextInt();
        System.out.println("Please Enter the value of triangle side c: ");
        int c = scanner.nextInt();
        trianglearea(a, b, c);
        scanner.close();
    }
}
