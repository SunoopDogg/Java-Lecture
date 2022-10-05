package chap05;

public class SchoolCleanFloor extends SchoolClean {
    private double dustpanDegree;
    private double trashCanLiter;

    public SchoolCleanFloor(ClassRoom classRoom, Student student, double cleanDegree, String cleanType,
            double dustpanDegree, double trashCanLiter) {
        super(classRoom, student, cleanDegree, cleanType);
        this.dustpanDegree = dustpanDegree;
        this.trashCanLiter = trashCanLiter;
    }

    public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
        boolean result = super.procClean(onceCleanDegree, maxCleanDegree);

        this.dustpanDegree++;
        this.trashCanLiter++;

        System.out.println(this.student.name + "의 쓰레받기는 " + this.dustpanDegree + " 만큼 채워졌고 ");
        System.out.println(this.student.name + "의 휴지통 리터량은 " + this.trashCanLiter + " 입니다.");

        if (this.dustpanDegree >= 10) {
            this.dustpanDegree = 0;
            System.out.println(this.student.name + "의 쓰레받기를 비웠습니다.");
        }

        if (this.trashCanLiter >= 10.0) {
            this.trashCanLiter = 0;
            System.out.println(this.student.name + "의 휴지통을 비웠습니다");
        }

        return result;
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