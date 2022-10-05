package chap04;

import java.util.Scanner;

public class Chap04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 직업은 무엇입니까? (S: 학생, P: 교수, E: 교직원): ");
        String userType = sc.nextLine();

        if (userType.equals("S")) {
            System.out.print("당신의 학년을 입력하세요: ");
            int grade = sc.nextInt();

            switch (grade) {
                case 1:
                    System.out.println("당신의 학년은 1학년입니다.");
                    break;
                case 2:
                    System.out.println("당신의 학년은 2학년입니다.");
                    break;
                case 3:
                    System.out.println("당신의 학년은 3학년입니다.");
                    break;
                case 4:
                    System.out.println("당신의 학년은 4학년입니다.");
                    break;
                default:
                    System.out.println("없는 학년입니다.");
                    break;
            }
        } else if (userType.equals("P")) {
            String[] professors = { "홍길수", "김길수", "정길수", "이길수", "노길수", "송길수" };

            System.out.print("교수님의 성함을 입력하세요: ");
            String professorName = sc.nextLine();

            int i = 0;
            while (true) {
                if (i >= professors.length) {
                    System.out.println("없는 교수님입니다.");
                    break;
                } else if (professorName.equals(professors[i])) {
                    System.out.println("교수님의 재임기간 순서는 " + (i + 1) + "번째 입니다.");
                    break;
                }
                i++;
            }
        } else if (userType.equals("E")) {
            String[] employees = { "김교직", "노교직", "송교직", "asdf", "유교직", "정교직", "홍교직" };

            System.out.print("교직원의 성함을 입력하세요: ");
            String employeeName = sc.nextLine();

            for (int i = 0; i <= employees.length; i++)
                if (i >= 4) {
                    break;
                } else if (employeeName.equals(employees[i])) {
                    System.out.println((i + 1) + "번째 교직원입니다.");
                    break;
                }
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }
}
