package homeworkweek6;

import java.util.Scanner;

/**
 * A Java program that takes a number as input and prints its multiplication table up to 10.
 */
public class Programme10forTable {

    //print statement for table
    public static void printTable(int num, int i) {
        System.out.println(num + " * " + i + " = " + num * i);
    }

    // logic for creating table method
    public static void table(int num) {
        printTable(num, 1);
        printTable(num, 2);
        printTable(num, 3);
        printTable(num, 4);
        printTable(num, 5);
        printTable(num, 6);
        printTable(num, 7);
        printTable(num, 8);
        printTable(num, 9);
        printTable(num, 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        table(num);
        scanner.close();
    }
}
