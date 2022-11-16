package chap11;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.name = "John";
        p.age = 30;
        p.print();

        Child c = new Child();
        c.name = "Mary";
        c.age = 20;
        c.print();

        Parent pc = new Child();
        pc.name = "Tom";
        pc.age = 25;
        pc.print();

        // cast
        Child c2 = (Child) pc;
        c2.name = "Jerry";
        c2.age = 15;
        c2.print();


    }
}