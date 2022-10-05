package chap02;

import java.util.Scanner;

public class Chap02 {
    public static void main(String[] args) {
        String userId = "";
        String userName = "";
        int userAge = 0;

        String user2Id = "";
        String user2Name = "";
        int user2Age = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 ID를 입력하세요.");
        userId = scanner.nextLine();
        System.out.println("당신의 ID는 " + userId + "입니다.");

        System.out.println("당신의 이름을 입력하세요.");
        userName = scanner.nextLine();
        System.out.println("당신의 이름은 " + userName + "입니다.");

        System.out.println("당신의 나이를 입력하세요.");
        userAge = scanner.nextInt();
        System.out.println("당신의 나이는 " + userAge + "입니다.");
        String temp = scanner.nextLine();

        int endAge = userAge + 10;
        System.out.println("당신의 서비스 이용 기한 나이는 " + endAge + "입니다.");

        System.out.println("당신의 ID를 입력하세요.");
        user2Id = scanner.nextLine();
        System.out.println((userId.equals(user2Id) ? "동일한 ID입니다" : "다른 ID입니다."));
        System.out.println("당신의 ID는 " + user2Id + "입니다.");

        System.out.println("당신의 이름을 입력하세요.");
        user2Name = scanner.nextLine();
        System.out.println("당신의 이름은 " + user2Name + "입니다.");

        System.out.println("당신의 나이를 입력하세요.");
        user2Age = scanner.nextInt();
        System.out.println("당신의 나이는 " + user2Age + "입니다.");

        scanner.close();
    }
}
