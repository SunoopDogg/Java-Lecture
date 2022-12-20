package chap12;

public interface Controllable {

    void start();

    void stop();

    default void repair() {
        System.out.println("Repairing...");
    }

    static void reset() {
        System.out.println("Resetting...");
    }

}