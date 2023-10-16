package homeworkweek6;

import java.util.Scanner;

/**
 * A program for a calculator with addition, subtraction, multiplication
 * and division
 * with parameters and use string concatenation methods.
 **/
public class Programme5Calculator {
    //instance method for addition
    //Used string concatenation methods in the print statement
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of two number: " + sum);
    }

    //instance method for subtraction with concatenation in print statement
    public void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("Substraction of two number: " + sub);
    }

    //static method for multiplication with concatenation in print statement
    public static void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication of two number: " + mul);
    }

    //static method for division with concatenation in print statement
    public static void division(int a, int b) {
        float div = (float) a / b;
        System.out.println("Division of two number: " + div);
    }

    public static void main(String[] args) {
        Programme5Calculator pc = new Programme5Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter number b: ");
        int b = scanner.nextInt();
        pc.addition(a, b);
        pc.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        scanner.close();
    }
}
