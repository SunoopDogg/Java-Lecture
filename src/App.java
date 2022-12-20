public class App {

    static int a = 10;

    public static void main(String[] args) {
        a = 20;

        System.out.println(a);

    }
}

// 인터페이스에 대한 예제
interface InterTest1 {
    // public abstract 가 생략되어 있음
    void i1_v();

    abstract void i1_av();

    public abstract void i1_psv();

    private void i1_p() { // 인터페이스 내부에서만 사용하는 메소드 이므로 바디가 정의 되어 있어야 함
        System.out.println("i1_p");
    }

    default void i1_d() { // 오버라이딩이 가능한 메소드, 필수가 아니므로 함수 바디가 정의 되어 있어야 함
        System.out.println("i1_d");
        i1_p();
    }

    static void i1_s() { // static 특성상 무조건 초기화 과정이 있어야 되므로 함수 바디가 정의 되어 있어야 함
        System.out.println("i1_s");
    }
}

interface InterTest2 {
    void i2_v();
}

interface InterTest3 extends InterTest1, InterTest2 {
    void i3_v();
}

abstract class Test1 {
    static int t1_si = 10;

    public void t1_pv() {
        System.out.println("추상 클래스의 메소드");
    }

    abstract int t1_a();
}

class Test2 extends Test1 implements InterTest3 {
    @Override
    public void i1_v() {
        System.out.println("인터페이스1의 메소드");
    }

    @Override
    public void i1_av() {
        System.out.println("인터페이스1의 메소드");
    }

    @Override
    public void i1_psv() {
        System.out.println("인터페이스1의 메소드");
    }

    @Override
    public void i2_v() {
        System.out.println("인터페이스2의 메소드");
    }

    @Override
    public void i3_v() {
        System.out.println("인터페이스3의 메소드");
    }

    @Override
    int t1_a() {
        return 0;
    }

    @Override
    public void i1_d() {
        System.out.println("인터페이스1의 메소드");
    }

    @Override
    public void t1_pv() {
        System.out.println("클래스 Test2의 오버라이딩된 메소드");
    }
}

class Animal {
    int age;

    public void myMethod() {
        System.out.println("동물");
    }
}

class Dog extends Animal {
    String sound;

    public void myMethod() {
        System.out.println("강아지");
    }

    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    private String sound;

    public void myMethod() {
        System.out.println("고양이");
    }

    public void meow() {
        System.out.println("야옹");
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}