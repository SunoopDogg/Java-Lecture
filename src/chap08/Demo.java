package chap12;

public class Demo {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer = new Computer();

        tv.start();
        tv.stop();
        tv.changeChannel();
        tv.repair();

        computer.start();
        computer.stop();
        computer.changeChannel();
        computer.repair();

    }
}
