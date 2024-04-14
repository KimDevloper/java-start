package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;
        double average = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하시려면 -1을 입력하세요 : ");
        while(true) {
            input = sc.nextInt();
            if(input == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum = sum + input;
            count++;
        }
        average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: "+ average);
    }
}
