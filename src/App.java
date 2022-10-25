import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int list[] = new int[5];
        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.print("입력:");
            list[i] = scanner.nextInt();
            if (list[i] > 0)
                sum += list[i];
        }

        System.out.println("양수의 합계는 " + sum);

        scanner.close();
    }
}
