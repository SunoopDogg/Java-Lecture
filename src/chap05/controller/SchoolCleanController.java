package chap05.controller;

import chap05.SchoolCleanFloor;
import chap05.SchoolCleanWindow;
import chap05.model.ClassRoom;
import chap05.model.Student;

public class SchoolCleanController {
    public static void main(String[] args) {
        System.out.println("청소 시작");

        ClassRoom classRoom = new ClassRoom("1");
        Student student = new Student("홍길동", 1);
        SchoolCleanFloor schoolCleanFloor = new SchoolCleanFloor(classRoom, student, 10.0, "바닥", 0.0, 0.0);
        boolean isDone = false;
        while (!isDone)
            isDone = schoolCleanFloor.procClean(1, 100);

        classRoom = new ClassRoom("2반");
        student = new Student("김길동", 2);
        SchoolCleanWindow schoolCleanWindow = new SchoolCleanWindow(classRoom, student, 10.0, "창문", 5, 1.0);
        isDone = false;
        while (!isDone)
            isDone = schoolCleanWindow.procClean(1, 100);

        System.out.println("청소 종료");
    }
}