package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 종료됩니다.");
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 :");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 :");
            int n2 = sc.nextInt();
            if(n1 == 0 && n2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            int sum = n1 + n2;
            System.out.println("두 숫자의 합: " + sum);
        }

    }
}
