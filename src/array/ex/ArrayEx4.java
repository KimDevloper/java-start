package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자를 입력하세요.");
        int n = sc.nextInt();

        int[] num = new int[n];
        int sum = 0;
        double avg = 0;

        System.out.println(n + "개의 정수 입력: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        avg = (double) n / 5;
        System.out.println("합계" + sum);
        System.out.println("평균" + avg);
    }
}
