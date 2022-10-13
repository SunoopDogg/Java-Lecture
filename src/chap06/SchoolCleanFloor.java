package chap05;

import chap05.model.ClassRoom;
import chap05.model.Student;

public class SchoolCleanFloor extends SchoolClean {
    private double dustpanDegree; // 쓰레받기의 먼지 정도
    private double trashCanLiter; // 휴지통의 량

    // 생성자
    public SchoolCleanFloor(ClassRoom classRoom, Student student, double cleanDegree, String cleanType,
            double dustpanDegree, double trashCanLiter) {
        super(classRoom, student, cleanDegree, cleanType); // 부모 클래스의 생성자 호출
        this.dustpanDegree = dustpanDegree;
        this.trashCanLiter = trashCanLiter;
    }

    @Override
    public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
        procCleanFloor();
        return super.procClean(onceCleanDegree, maxCleanDegree);
    }

    // 쓰레받기를 사용하여 바닥을 닦는다.
    public void procCleanFloor() {
        this.dustpanDegree++; // 쓰레받기의 먼지 정도 증가
        this.trashCanLiter++; // 휴지통의 량 증가

        System.out.println(this.getStudent().getName() + "이(가) " + this.getClassRoom().getClassName() + "반의 "
                + this.getCleanType() + "청소를 " + this.getCleanDegree() + "만큼 했습니다.");
        System.out.println(this.getStudent().getName() + "의 휴지통 리터량은 " + this.trashCanLiter + " 입니다.");

        // 쓰레받기의 먼지 정도가 10이상이면 쓰레받기를 비웁니다.
        if (this.dustpanDegree >= 10) {
            this.dustpanDegree = 0;
            System.out.println(this.getStudent().getName() + "의 쓰레받기를 비웠습니다.");
        }

        // 휴지통의 량이 10이상이면 휴지통을 비웁니다.
        if (this.trashCanLiter >= 10.0) {
            this.trashCanLiter = 0;
            System.out.println(this.getStudent().getName() + "의 휴지통을 비웠습니다");
        }
    }

    public double getDustpanDegree() {
        return this.dustpanDegree;
    }

    public void setDustpanDegree(double dustpanDegree) {
        this.dustpanDegree = dustpanDegree;
    }

    public double getTrashCanLiter() {
        return this.trashCanLiter;
    }

    public void setTrashCanLiter(double trashCanLiter) {
        this.trashCanLiter = trashCanLiter;
    }
}