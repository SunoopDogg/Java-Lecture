package chap12;

public class TV implements Controllable {

    public void start() {
        System.out.println("TV started");
    }

    public void stop() {
        System.out.println("TV stopped");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
