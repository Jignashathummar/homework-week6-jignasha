package homeworkweek6;

import java.util.Scanner;

/**
 * a Java program to convert a decimal number to binary number.
 */

public class Programme17ConvertBinary {
    public static void binaryString(int a) {
        System.out.println("Binary number is: " + Integer.toBinaryString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int x = sc.nextInt();
        binaryString(x);
        sc.close();
    }
}
