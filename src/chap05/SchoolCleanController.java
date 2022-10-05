package chap05;

public class SchoolCleanController {
    public static void main(String[] args) {
        System.out.println("청소 시작");

        ClassRoom classRoom = new ClassRoom("1반");
        Student student = new Student("홍길동", 1);
        SchoolCleanFloor schoolCleanFloor = new SchoolCleanFloor(classRoom, student, 10.0, "바닥", 0.0, 0.0);
        schoolCleanFloor.procClean(10, 100);

        classRoom = new ClassRoom("2반");
        student = new Student("김길동", 2);
        SchoolCleanWindow schoolCleanWindow = new SchoolCleanWindow(classRoom, student, 10.0, "창문", 5, 1.0);
        schoolCleanWindow.procClean(10, 100);

        System.out.println("청소 종료");
    }
}