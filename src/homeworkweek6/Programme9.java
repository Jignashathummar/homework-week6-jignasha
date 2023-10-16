package homeworkweek6;

import java.util.Scanner;

/**
 * Convert the upper case to lower case
 */
public class Programme9 {
    //instance method for convert string uppercase to lowercase
    public static void uppercase(String name) {
        System.out.println(name.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for convert into upper case to lower case: ");
        String name = scanner.nextLine();
        uppercase(name);
        scanner.close();
    }
}
