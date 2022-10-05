package chap05;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
