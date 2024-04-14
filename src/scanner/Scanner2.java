package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 :");
        int n1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 :");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;
        System.out.print("두 숫자의 합 : " + sum);
    }
}
