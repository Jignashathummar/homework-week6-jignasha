package homeworkweek6;

/**
 * Java program to swap two variables.
 */
public class Programme15Swap {
    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        b = 21;
        System.out.println("Before swapping: a, b = " + a + " , " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a, b = " + a + " , " + b);
    }
}
