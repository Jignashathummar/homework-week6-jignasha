package homeworkweek6;

import java.util.Scanner;

public class Programme18Math {
    public static void add(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public void sub(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public void mul(int x, int y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public void div(int x, int y) {
        System.out.println(x + " / " + y + " = " + (x / y));
    }

    public void mod(int x, int y) {
        System.out.println(x + " mod " + y + " = " + (x % y));
    }

    public static void main(String[] args) {
        Programme18Math p18 = new Programme18Math();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number: ");
        int b = sc.nextInt();
        add(a, b);
        p18.sub(a, b);
        p18.mul(a, b);
        p18.div(a, b);
        p18.mod(a, b);
        sc.close();
    }
}
