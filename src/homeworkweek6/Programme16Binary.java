package homeworkweek6;

import java.util.Scanner;

/**
 * a Java program to add two binary numbers.
 */
public class Programme16Binary {
    //function to add binary strings
    public static void addBinary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String s1 = scanner.next();
        System.out.println("Input second binary number: ");
        String s2 = scanner.next();
        addBinary(s1, s2);
        scanner.close();
    }

}
