package homeworkweek6;

import java.util.Scanner;

/**
 * A Java program that takes a number as input and prints its multiplication table up to 10.
 */
public class Programme10forTable {

    //print statement for table
    //method 1
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

        System.out.println("Create table using method 1 like ten time print statment");
        table(num);

        System.out.println("Create table using method 2 look like for loop but hasn't used for loop");
        int start = 1;
        int end = 10;
        printNumberTable(start, end, num);
        scanner.close();
    }
//method 2
    public static void printNumberTable(int start, int end, int num) {
        if (start > end) {
            return;
        }

        System.out.println(num + " * " + start + " = " + start * num);
        printNumberTable(start + 1, end, num);
    }

}
