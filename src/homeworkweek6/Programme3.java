package homeworkweek6;

public class Programme3 {
    //static variable
    static int x = 13;
    //instance variable
    boolean b = true;

    //instance method
    //call both variables into instance method
    public void m1() {
        Programme3 p1 = new Programme3();
        System.out.println("static variable from m1: " + p1.x);
        System.out.println("instance variable from m1: " + b);
    }

    //static method
    //call both variables into static method
    public static void m2() {
        Programme3 p2 = new Programme3();
        System.out.println("static variable from m2: " + x);
        System.out.println("static variable from m2: " + p2.b);

    }

    //main method
    public static void main(String[] args) {
        Programme3 p3 = new Programme3();
        m2();
        p3.m1();
    }
}
