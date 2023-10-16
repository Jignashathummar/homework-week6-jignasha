package homeworkweek6;

import java.util.Scanner;

public class Programme7Temperature {

    /**
     * a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
     *
     */
    //static method for convert Temperature from Fahrenheit to Celsius
    //used concatenation in the print statement
    public static void celsius(int fahrenheit) {
        int celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println("Convert temperature from fahrenheit to celsius: " + celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in fahrenheit: ");
        int fah = scanner.nextInt();
        celsius(fah);
        scanner.close();
    }
}
