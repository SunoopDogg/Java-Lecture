package chap05;

public class SchoolClean {
    ClassRoom classRoom;
    Student student;
    double cleanDegree;
    String cleanType;

    public SchoolClean(ClassRoom classRoom, Student student, double cleanDegree, String cleanType) {
        this.classRoom = classRoom;
        this.student = student;
        this.cleanDegree = cleanDegree;
        this.cleanType = cleanType;
    }

    public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
        boolean result = false;

        this.cleanDegree += onceCleanDegree;

        System.out.println(this.student.name + "이(가) " + this.classRoom.getClassName() + "반의 " + this.cleanType + "청소를 "
                + this.cleanDegree + "만큼 했습니다.");

        if (this.cleanDegree >= maxCleanDegree)
            result = true;

        if (result)
            System.out.println(this.student.name + "가 " + this.classRoom.getClassName() + "반의 " + this.cleanType
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
