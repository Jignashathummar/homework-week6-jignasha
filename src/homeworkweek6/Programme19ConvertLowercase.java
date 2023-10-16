package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to convert a given string into lowercase.
 */
public class Programme19ConvertLowercase {
    public static void upperToLower(String name) {
        System.out.println(name.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Uppercase String: ");
        String n1 = sc.nextLine();
        upperToLower(n1);
        sc.close();
    }
}
