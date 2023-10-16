package homeworkweek6;

public class Programme4 {

    //static variables
    static int a = 110;
    static int b = 120;
    //instance variables
    String s1 = "Jignasha";
    String s2 = "Thummar";

    //instance method
    public void method() {
        System.out.println("static variable in instance method: " + a); //static variable into instance method
        System.out.println("static variable in instance method: " + b); //static variable into instance method
        System.out.println("instance variable in instance method: " + s1); //instance variable into instance method
        System.out.println("instance variable in instance method:" + s2); //instance variable into instance method

    }

    //static method
    public static void method1() {
        Programme4 p1 = new Programme4();
        System.out.println("static variable in static method1: " + a); //static variable into static method
        System.out.println("static variable in static method1: " + b); //static variable into static method
        System.out.println("instance variable in static method1: " + p1.s1); //instance variable into static method
        System.out.println("instance variable in static method1: " + p1.s2); //instance variable into static method
    }

    //main method
    public static void main(String[] args) {
        Programme4 p2 = new Programme4();
        p2.method(); // call instance method
        method1(); //call static method
    }
}
