
public class App {
    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 10;
        t1.y = 20;

        t2.x = 30;
        t2.y = 40;

        t1 = t2;

        System.out.println(t1.x + ", " + t1.y);
        System.out.println(t2.x + ", " + t2.y);

        t2.x = 50;
        t2.y = 60;

        System.out.println(t1.x + ", " + t1.y);
        System.out.println(t2.x + ", " + t2.y);
    }

}

class Test {
    int x = 0;
    int y = 0;

    public Test() {

    }
}