package chap05;

public class SchoolCleanWindow extends SchoolClean {
	private int cleanHangDegree;
	private double windexLiter;

	public SchoolCleanWindow(ClassRoom classRoom, Student student, double cleanDegree, String cleanType,
			int cleanHangDegree, double windowDegree) {
		super(classRoom, student, cleanDegree, cleanType);
		this.cleanHangDegree = cleanHangDegree;
		this.windexLiter = windowDegree;
	}

	public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
		boolean result = super.procClean(onceCleanDegree, maxCleanDegree);

		this.cleanHangDegree--;
		this.windexLiter -= 0.5;

		System.out.println(this.student.name + "의 행주는 " + this.cleanHangDegree + " 만큼 깨끗하고 ");
		System.out.println(this.student.name + "의 윈덱스 리터량은 " + this.windexLiter + " 입니다.");

		if (this.cleanHangDegree <= 10) {
			this.cleanHangDegree = 100;
			System.out.println(this.student.name + "의 청소망을 교체했습니다.");
		}

		if (this.windexLiter <= 0.1) {
			this.windexLiter = 10.0;
			System.out.println(this.student.name + "의 윈도우 클리너를 교체했습니다.");
		}

		return result;
	}

	public int getCleanHangDegree() {
		return this.cleanHangDegree;
	}

	public void setCleanHangDegree(int cleanHangDegree) {
		this.cleanHangDegree = cleanHangDegree;
	}

	public double getWindexLiter() {
		return this.windexLiter;
	}

	public void setWindexLiter(double windexLiter) {
		this.windexLiter = windexLiter;
	}
}