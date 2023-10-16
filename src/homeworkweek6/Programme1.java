package homeworkweek6;

public class Programme1 {
    //instance variable
    int a = 15;
    int b = 20;

    //instance method
    //call both variable
    public void method() {
        Programme1 p1 = new Programme1();
        System.out.println(p1.a); //instance to instance direct calling
        System.out.println(p1.b);//instance to instance direct calling
    }

    public static void main(String[] args) {
        Programme1 pm = new Programme1();
        pm.method(); //instance to static method calling by object
    }
}
