package homeworkweek6;

import java.util.Scanner;

/**
 * three numbers as input to calculate and print the average of the numbers.
 */
public class Programme13Average {
    // Logic for average of three number
    public static void average(int a, int b, int c) {
        System.out.println("Average number is:" + (a + b + c) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number B: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter number C: ");
        int num3 = scanner.nextInt();
        average(num1, num2, num3);
        scanner.close();
    }
}
