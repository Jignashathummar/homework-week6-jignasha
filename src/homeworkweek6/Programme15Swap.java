package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to swap two variables.
 */
public class Programme15Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a: ");
        int a = sc.nextInt();
        System.out.println("Please enter b: ");
        int b = sc.nextInt();
        swapWithoutThirdVariable(a,b);
        swapWithThirdVariable(a, b);

    }
    public static void swapWithThirdVariable(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("Swap value with using third variable: a = " + a + ", b = " + b);
    }
    public static void swapWithoutThirdVariable(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap value without using third variable: a = " + a + ", b = " + b);
    }
}
