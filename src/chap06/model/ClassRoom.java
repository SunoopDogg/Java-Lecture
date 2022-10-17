package chap06.model;

public class ClassRoom {
    private String className; // 반 이름

    public ClassRoom(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}