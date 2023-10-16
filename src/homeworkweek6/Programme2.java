package homeworkweek6;

public class Programme2 {
    //static variables
    static int a = 21;
    static String s = "Jignasha";

    //static method
    public static void method() {
        System.out.println(a); //static variable into static method
        System.out.println(s); //static variable into static method

    }

    public static void main(String[] args) {
        method(); //static method in static method
    }
}
