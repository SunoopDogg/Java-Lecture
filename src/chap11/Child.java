package chap11;

public class Child extends Parent {
    String name;
    int age;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("child");
    }
}
