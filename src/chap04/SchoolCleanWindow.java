// package chap04;

// public class SchoolCleanWindow {
// private String schoolClass; // 학교 반
// private String worker; // 청소학생
// private int cleanHangDegree; // 행주 깨끗한 정도
// private double windexLiter; // 윈덱스_리터량
// private int cleanWindowDegree; // 창문 청소 정도

// // 생성자
// // 접근자 public, 반환 없음, 초기화 역할
// public SchoolCleanWindow(String sClass, String wk, int cHangDe, double
// wLiter) {
// this.schoolClass = sClass;
// this.worker = wk;
// this.cleanHangDegree = cHangDe;
// this.windexLiter = wLiter;
// }

// /*
// * 각 호실 창문 닦기 실시 parameter : int OnceCleanDegree - 한번에 청소하는 정도, int
// * maxCleanDegree - 청소 완료 정도 return : 청소완료 여부
// */
// public boolean procCleanWindow(int onceCleanDegree, int maxCleanDegree) {
// boolean doneIs = false;
// this.cleanWindowDegree += onceCleanDegree;
// ; // 한번에 창문닦는 범위 더해줌
// if (this.cleanWindowDegree >= maxCleanDegree)
// doneIs = true;

// this.cleanHangDegree--; // 행주 깨끗한 정도 1씩 차감
// this.windexLiter -= 0.5; // 윈덱스 리터량 0.1씩 차감

// System.out.println(this.worker + "가 " + this.schoolClass + "반의 창문닦기를 " +
// this.cleanWindowDegree + "만큼 했습니다.");
// System.out.println(this.worker + "의 행주는 " + this.cleanHangDegree + " 만큼 깨끗하고
// ");
// System.out.println(this.worker + "의 윈덱스 리터량은 " + this.windexLiter + " 입니다.");

// if (this.cleanHangDegree == 10) // 작업자의 행주 깨끗한 정도가 0이면
// {
// // 행주 빨기
// this.cleanHangDegree = 100; // 작업자의 행주 깨끗한 정도 100으로
// System.out.println(this.worker + "의 행주를 빨았습니다.");
// }

// if (this.windexLiter < 0.1) // 윈덱스 리터량이 0.1보다 작으면
// {
// // 윈덱스 채우기
// this.windexLiter = 10.0;
// System.out.println(this.worker + "의 윈덱스 리터량을 다시 채웠습니다");
// }

// if (doneIs)
// System.out.println(this.worker + "가 " + this.schoolClass + "반의 창문닦기를
// 마쳤습니다.\n\n");
// return doneIs;
// }

// }
