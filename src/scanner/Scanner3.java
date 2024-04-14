package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 :");
        int n1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 :");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2" + n1);
        }
        else if (n1 < n2) {
            System.out.println("n1 < n2" + n2);
        }
        else {
            System.out.println("두 숫자가 같습니다.");
        }
    }
}
