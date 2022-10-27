package chap05;

import chap05.model.ClassRoom;
import chap05.model.Student;

public class SchoolClean {
    private ClassRoom classRoom; // 반
    private Student student; // 학생
    private double cleanDegree; // 청소 정도
    private String cleanType; // 청소 종류

    // 생성자
    public SchoolClean(ClassRoom classRoom, Student student, double cleanDegree, String cleanType) {
        this.classRoom = classRoom;
        this.student = student;
        this.cleanDegree = cleanDegree;
        this.cleanType = cleanType;
    }

    // 청소를 한다.
    public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
        boolean result = false;

        this.cleanDegree += onceCleanDegree; // 청소 정도 증가

        System.out.println(
                this.student.getName() + "이(가) " + this.classRoom.getClassName() + "반의 " + this.cleanType + "청소를 "
                        + this.cleanDegree + "만큼 했습니다.");

        // 청소 정도가 최대 청소 정도보다 크거나 같으면 청소 종료
        if (this.cleanDegree >= maxCleanDegree)
            result = true;

        if (result)
            System.out.println(this.student.getName() + "가 " + this.classRoom.getClassName() + "반의 " + this.cleanType
                    + "청소를 마쳤습니다.\n\n");

        return result;
    }

    public ClassRoom getClassRoom() {
        return this.classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getCleanDegree() {
        return this.cleanDegree;
    }

    public void setCleanDegree(double cleanDegree) {
        this.cleanDegree = cleanDegree;
    }

    public String getCleanType() {
        return this.cleanType;
    }

    public void setCleanType(String cleanType) {
        this.cleanType = cleanType;
    }
}
