package chap12;

public class Computer implements Controllable {

    public void start() {
        System.out.println("Computer started");
    }

    public void stop() {
        System.out.println("Computer stopped");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }

}
