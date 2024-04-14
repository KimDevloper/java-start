package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요 : ");
        int x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("입력한 숫자 " + x + "홀수입니다.");
        }
        else {
            System.out.println("입력한 숫자 " + x + "짝수입니다.");
        }
    }
}
