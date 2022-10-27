package chap05;

import chap05.model.ClassRoom;
import chap05.model.Student;

public class SchoolCleanWindow extends SchoolClean {
	private int cleanHangDegree; // 행주의 더러움 정도
	private double windexLiter; // 윈도우 클리너의 량

	// 생성자
	public SchoolCleanWindow(ClassRoom classRoom, Student student, double cleanDegree, String cleanType,
			int cleanHangDegree, double windowDegree) {
		super(classRoom, student, cleanDegree, cleanType); // 부모 클래스의 생성자 호출
		this.cleanHangDegree = cleanHangDegree;
		this.windexLiter = windowDegree;
	}

	@Override
	public boolean procClean(int onceCleanDegree, int maxCleanDegree) {
		procCleanWindow();
		return super.procClean(onceCleanDegree, maxCleanDegree);
	}

	// 윈도우 클리너를 사용하여 창문을 닦는다.
	public void procCleanWindow() {
		this.cleanHangDegree--; // 윈도우 클리너의 먼지 정도 감소
		this.windexLiter -= 0.5; // 윈도우 클리너의 량 감소

		System.out.println(this.getStudent().getName() + "의 행주는 " + this.cleanHangDegree + " 만큼 깨끗하고 ");
		System.out.println(this.getStudent().getName() + "의 윈덱스 리터량은 " + this.windexLiter + " 입니다.");

		// 행주의 더러움 정도가 10 이하이면 행주를 닦는다.
		if (this.cleanHangDegree <= 10) {
			this.cleanHangDegree = 100;
			System.out.println(this.getStudent().getName() + "의 청소망을 교체했습니다.");
		}

		// 윈도우 클리너의 량이 0 이하이면 윈도우 클리너를 채운다.
		if (this.windexLiter <= 0.1) {
			this.windexLiter = 10.0;
			System.out.println(this.getStudent().getName() + "의 윈도우 클리너를 교체했습니다.");
		}
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